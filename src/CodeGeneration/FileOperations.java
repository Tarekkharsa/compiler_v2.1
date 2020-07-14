package CodeGeneration;

import Java.AST.QueryStmt.SelectStmt.SelectCore;
import Java.Main;
import Java.SymbolTable.Symbol;
import Java.SymbolTable.Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FileOperations {
   public List<Symbol> list = new ArrayList<>();
   public String table = "";
    Map<String, Type> Mycolumns = new LinkedHashMap<>();
    public void writeFile(File file, Map<String, Type> columns, Type tableName) {
        table = tableName.getName();
        Mycolumns = columns;
        System.out.println("columns "+columns.size());
        try (PrintWriter pr = new PrintWriter(file)) {

            pr.append(
                    "import java.io.BufferedReader;\n" +
                            "import java.io.IOException;\n" +
                            "import java.nio.charset.StandardCharsets;\n" +
                            "import java.nio.file.Files;\n" +
                            "import java.nio.file.Path;\n" +
                            "import java.nio.file.Paths;\n" +
                            "import java.util.ArrayList;\n" +
                            "import java.util.List;\n\n"
            );

            if (tableName.getTypeCG() != null) {
                if (tableName.getTypeCG().equals("var")) {

                    if (Main.symbolTable.getScopes() != null) {
                        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
                            if (Main.symbolTable.getScopes().get(i).getParent() != null) {
                                if (Main.symbolTable.getScopes().get(i).getParent().getId().equals(tableName.getName())) {
                                    for (int j = 0; j < Main.symbolTable.getScopes().get(i).getSymbols().size(); j++) {
                                        if (Main.symbolTable.getScopes().get(i).getSymbols().get(j).getType().getName().equals("columnName")) {
                                            list.add(Main.symbolTable.getScopes().get(i).getSymbols().get(j));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(list.size() > 0){
                        pr.append("public class ").append(tableName.getName()).append("  { \n");
                        for (int i = 0; i < list.size(); i++) {
                            int finalI = i;

                            columns.forEach((key, value) -> {
                                if (key.equals(list.get(finalI).getName())) {
                                    if (value.getName().equals("number")) {
                                        pr.append("\tdouble ").append(key).append("; \n");
                                    } else if (value.getName().equals("string")) {
                                        pr.append("\tString ").append(key).append("; \n");
                                    } else if (value.getName().equals("boolean")) {
                                        pr.append("\tboolean ").append(key).append("; \n");
                                    } else {
                                        pr.append("\t").append(value.getName()).append(" ").append(key).append("; \n");
                                    }
                                }
                            });
                        }
                    }else{
                        pr.append("public class ").append(tableName.getName()).append("  { \n");
                        columns.forEach((key, value) -> {
                            if (value.getName().equals("number")) {
                                pr.append("\tdouble ").append(key).append("; \n");
                            } else if (value.getName().equals("string")) {
                                pr.append("\tString ").append(key).append("; \n");
                            } else if (value.getName().equals("boolean")) {
                                pr.append("\tboolean ").append(key).append("; \n");
                            } else {
                                pr.append("\t").append(value.getName()).append(" ").append(key).append("; \n");
                            }
                        });
                    }
                }
            }
            System.out.println("list"+list.size());

            if (!tableName.getTypeCG().equals("var")) {
                pr.append("public class ").append(tableName.getName()).append("  { \n");
                columns.forEach((key, value) -> {
                    if (value.getName().equals("number")) {
                        pr.append("\tdouble ").append(key).append("; \n");
                    } else if (value.getName().equals("string")) {
                        pr.append("\tString ").append(key).append("; \n");
                    } else if (value.getName().equals("boolean")) {
                        pr.append("\tboolean ").append(key).append("; \n");
                    } else {
                        pr.append("\t").append(value.getName()).append(" ").append(key).append("; \n");
                    }
                });
            }
            // file type
            if (tableName.getFileType() != null) {
                pr.append("\tString type = " + "\"").append(tableName.getFileType()).append("\"").append("; \n");
            }
            // string path
            if (tableName.getPath() != null) {
                String path = tableName.getPath().replace("\\", "\\\\").replace("'", "\"");
                pr.append("\tString path  = ").append(path).append("; \n");
            }
            // data array
            pr.append("\tstatic List<").append(tableName.getName()).append("> data  = new ArrayList<>();  \n");
            // default constructor
            pr.append("\tpublic ").append(tableName.getName()).append("(");
            pr.append(") \n");
            pr.append("\t\t{\n");
            pr.append("\n\t\t}\n\n");

            // constructor with parameters


            if (tableName.getTypeCG().equals("var")) {
                AtomicInteger paramCount = new AtomicInteger();
                pr.append("\tpublic ").append(tableName.getName()).append("(");
                if(list.size()>0){
                    for (int i = 0; i < list.size(); i++) {
                        int finalI = i;
                        columns.forEach((key, value) -> {
                            if (key.equals(list.get(finalI).getName())) {
                                if (value.getName().equals("number")) {
                                    pr.append("double ").append(key).append("");
                                    paramCount.getAndIncrement();
                                } else if (value.getName().equals("string")) {
                                    paramCount.getAndIncrement();
                                    pr.append("String ").append(key).append("");
                                } else if (value.getName().equals("boolean")) {
                                    paramCount.getAndIncrement();
                                    pr.append("boolean ").append(key).append("");
                                } else {
                                    pr.append(value.getName()).append(" ").append(key).append("");
                                    paramCount.getAndIncrement();
                                }
                                if (paramCount.get() != list.size()) {
                                    pr.append(",");
                                }
                            }
                        });

                    }
                } else {
                    AtomicInteger z= new AtomicInteger();
                    columns.forEach((key, value) -> {

                            if (value.getName().equals("number")) {
                                pr.append("double ").append(key).append("");
                                z.getAndIncrement();
                            } else if (value.getName().equals("string")) {
                                z.getAndIncrement();
                                pr.append("String ").append(key).append("");
                            } else if (value.getName().equals("boolean")) {
                                z.getAndIncrement();
                                pr.append("boolean ").append(key).append("");
                            } else {
                                pr.append(value.getName()).append(" ").append(key).append("");
                                z.getAndIncrement();
                            }
                            if (z.get() != columns.size()) {
                                pr.append(",");
                            }

                    });
                }

                pr.append(") \n");
                pr.append("\t\t{\n");
                if(list.size() > 0){
                    for (int i = 0; i < list.size(); i++) {
                        int finalI1 = i;
                        columns.forEach((key, value) -> {
                            if (key.equals(list.get(finalI1).getName())) {

                                pr.append("\t\t\tthis.").append(key).append(" = ").append(key).append(";\n");
                            }
                        });
                    }
                }else {
                    columns.forEach((key, value) -> {
                            pr.append("\t\t\tthis.").append(key).append(" = ").append(key).append(";\n");
                    });
                }
                pr.append("\n\t\t}\n\n");

            }


            if (!tableName.getTypeCG().equals("var")) {

                AtomicInteger paramCount = new AtomicInteger();
                pr.append("\tpublic ").append(tableName.getName()).append("(");
                columns.forEach((key, value) -> {
                    if (value.getName().equals("number")) {
                        pr.append("double ").append(key).append("");
                        paramCount.getAndIncrement();
                    } else if (value.getName().equals("string")) {
                        paramCount.getAndIncrement();
                        pr.append("String ").append(key).append("");
                    } else if (value.getName().equals("boolean")) {
                        paramCount.getAndIncrement();
                        pr.append("boolean ").append(key).append("");
                    } else {
                        pr.append(value.getName()).append(" ").append(key).append("");
                        paramCount.getAndIncrement();
                    }
                    if (paramCount.get() != columns.size()) {
                        pr.append(",");
                    }
                });
                pr.append(") \n");
                pr.append("\t\t{\n");
                columns.forEach((key, value) -> {
                    pr.append("\t\t\tthis.").append(key).append(" = ").append(key).append(";\n");
                });
                pr.append("\n\t\t}\n\n");
            }


            // get Data in var type
            if (tableName.getTypeCG().equals("var")) {

                pr.append(
                        "\t\tpublic void getData(){\n");

                executeQuery(pr, columns, tableName, list);

                pr.append("\t\t}\n");


            }


            // load data function
            if (tableName.getFileType() != null) {
                pr.append("\tvoid load() {\n");

                pr.append("\t\tif(type.equals(\"csv\")) {\n\n");
                if (tableName.getPath() != null) {
                    // csv logic
                    pr.append(" " +
                            "\t\t\tPath pathToFile = Paths.get(path);\n" +
                            "\t\t\ttry (BufferedReader br = Files.newBufferedReader(pathToFile,\n" +
                            "\t\t\t\t\tStandardCharsets.US_ASCII)) {\n" +
                            "\t\t\t\tString line = br.readLine();\n" +
                            "\t\t\t\tline = br.readLine();\n" +
                            "\t\t\t\twhile (line != null) {\n" +
                            "\t\t\t\t\tString[] attributes = line.split(\",\");\n");

//
                    pr.append("\t\t\t\t" + tableName.getName() + " obj = new " + tableName.getName() + "(");
                    AtomicInteger i = new AtomicInteger();
                    AtomicInteger z = new AtomicInteger();
                    columns.forEach((key, value) -> {
                        if (value.getName().equals("number")) {

                            pr.append(" Double.parseDouble(attributes[" + i + "].replace(\"\\\"\",\" \"))");
                            i.getAndIncrement();
                            z.getAndIncrement();
                        } else if (value.getName().equals("string")) {
                            pr.append("attributes[" + i + "]");
                            i.getAndIncrement();
                            z.getAndIncrement();
                        } else if (value.getName().equals("boolean")) {
                            pr.append("Boolean.parseBoolean(attributes[" + i + "])");
                            i.getAndIncrement();
                            z.getAndIncrement();
                        }
//                        else {
//                            z.getAndIncrement();
//                            pr.append("\n\t\t\t\tnew " + value.getName() + "(");
//                            AtomicInteger x = new AtomicInteger();
//                            for (int i1 = 0; i1 < Main.symbolTable.getDeclaredTypes().size(); i1++) {
//                                if (Main.symbolTable.getDeclaredTypes().get(i1).getName().equals(value.getName())) {
//                                    int finalI = i1;
//                                    Main.symbolTable.getDeclaredTypes().get(i1).getColumns().forEach((key1, value2) -> {
////                                        pr.append("attributes[").append(String.valueOf(i)).append("]");
//                                        if (value2.getName().equals("number")) {
//                                            pr.append(" Double.parseDouble(attributes[").append(String.valueOf(i)).append("].replace(\"\\\"\",\" \"))");
//
//                                        } else{
//                                            pr.append("attributes[").append(String.valueOf(i)).append("]");
//                                        }
//                                        x.getAndIncrement();
//                                        i.getAndIncrement();
//                                        if(x.get() != Main.symbolTable.getDeclaredTypes().get(finalI).getColumns().size()){
//                                        pr.append(",");
//                                        }
//                                    });
//                                }
//                            }
//                            pr.append(")");
//
//
//                        }
                        if (z.get() != columns.size()) {
                            pr.append(",");
                        }
                    });
                    pr.append(");\n");

                    pr.append("\t\t\t\tdata.add(obj);\n" +
                            "\t\t\t\t\tline = br.readLine();\n" +
                            "\t\t\t\t}\n" +
                            "\n" +
                            "\t\t\t} catch (IOException ioe) {\n" +
                            "\t\t\t\tioe.printStackTrace();\n" +
                            "\t\t\t} " +
                            "");
                }
                pr.append("\t\t} else if(type.equals(\"json\")){\n\n");
                if (tableName.getPath() != null) {
                    // json logic
                }
                pr.append("\t\t}\n");
                pr.append("\t}\n");
            }


            /// get data function
            if (tableName.getFileType() != null) {
                pr.append(
                        "    public void getData(){\n" +
                                "        if(data.size() == 0){\n" +
                                "            load();\n" +
                                "        }\n" +

                                "    }"
                );
            }


            pr.append("}");
            pr.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void executeQuery(PrintWriter pr, Map<String, Type> columns, Type tableName, List<Symbol> list) {
        SelectCore selectCore = null;
        for (int i = 0; i < Main.selectCores.size(); i++) {
            if (Main.selectCores.get(i).getScope().getParent().getId().equals(tableName.getName())) {
                selectCore = Main.selectCores.get(i);
            }
        }


        if (Main.symbolTable.getScopes() != null) {
            for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
                if (Main.symbolTable.getScopes().get(i).getParent() != null) {
                    if (Main.symbolTable.getScopes().get(i).getParent().getId().equals(tableName.getName())) {
                        for (int j = 0; j < Main.symbolTable.getScopes().get(i).getSymbols().size(); j++) {
                            if (Main.symbolTable.getScopes().get(i).getSymbols().get(j).getType().getName().equals("tableName")) {
                                String object = Main.symbolTable.getScopes().get(i).getSymbols().get(j).getName().substring(0, Main.symbolTable.getScopes().get(i).getSymbols().get(j).getName().length() - 1);
                                pr.append("\t\t\t").append(Main.symbolTable.getScopes().get(i).getSymbols().get(j).getName() + " " + object + "= new " + Main.symbolTable.getScopes().get(i).getSymbols().get(j).getName() + "();\n");

                                pr.append("\t\t\t").append(object).append(".getData();");
                                pr.append("\n");
                                pr.append("\t\t\tfor (int i = 0; i < " + object + ".data.size(); i++) {\n");

                                if (selectCore.getWhereCondition() != null) {
                                    addWhereCon(selectCore.getWhereCondition(), object, pr);
                                }

                                pr.append("\t\t\t\tdata.add(new " + tableName.getName() + "(");

                               if(list.size() > 0){
                                   for (int i1 = 0; i1 < list.size(); i1++) {
                                       pr.append(object + ".data.get(i)." + list.get(i1).getName());
                                       if (i1 != list.size() - 1) {
                                           pr.append(",");
                                       }
                                   }
                               }else{
                                   AtomicInteger x = new AtomicInteger();
                                   columns.forEach((key, value) -> {
                                       pr.append(object + ".data.get(i)." +key+" ");
                                       x.getAndIncrement();
                                       if (x.get() != columns.size()) {
                                           pr.append(",");
                                       }
                                   });
                               }
                                pr.append("));\n");
                                if (selectCore.getWhereCondition() != null) {
                                    pr.append("\t\t\t\t}\n");
                                }
                                pr.append("\t\t\t}\n");

                            }
                        }
                    }
                }
            }
        }
    }

    private void addWhereCon(WhereCondition whereCondition, String object, PrintWriter pr) {
        pr.append("\t\t\t\tif(");
        addCondition(pr, object, whereCondition.getCondition());
        pr.append("){\n");
    }

    public boolean like = false;

    private void addCondition(PrintWriter pr, String object, Condition condition) {

        if (condition.getLeftCon() != null) {
            addCondition(pr, object, condition.getLeftCon());
        }

        if (condition.getColumnName() != null) {
            if (like) {
                pr.append(condition.getColumnName().replace("%", "") + ")");

            } else {

                pr.append(object + ".data.get(i)." + condition.getColumnName());
            }
            like = false;
        }
        if (condition.getOperator() != null) {
            if (condition.getOperator().equals("=")) {
                pr.append(" == ");
            } else if (condition.getOperator().equalsIgnoreCase("AND")) {
                pr.append(" && ");

            } else if (condition.getOperator().equalsIgnoreCase("OR")) {
                pr.append(" || ");

            }else if (condition.getOperator().equals("<>")) {
                pr.append(" != ");

            } else if (condition.getOperator().equalsIgnoreCase("like")) {
                like = true;
                pr.append(".contains(");

            } else {

                pr.append(" " + condition.getOperator() + " ");
            }
        }
        if (condition.getLiteralValue() != null) {
            if (condition.getLiteralValue().getNumericalValue() != null) {
                pr.append(condition.getLiteralValue().getNumericalValue() + " ");
            }
            if (condition.getLiteralValue().getStringValue() != null) {
                if (condition.getLiteralValue().getStringValue().replace("'", "").equalsIgnoreCase("true")) {

                    pr.append("true");
                } else if (condition.getLiteralValue().getStringValue().replace("'", "").equalsIgnoreCase("false")) {
                    pr.append("false");
                } else {

                    pr.append(condition.getLiteralValue().getStringValue() + " ");
                }
            }
            if (condition.getLiteralValue().getBlobValue() != null) {
                pr.append(condition.getLiteralValue().getBlobValue() + " ");
            }
        }


        if (condition.getRightCon() != null) {
            addCondition(pr, object, condition.getRightCon());
        }
    }
   public String object = "";
    public void writeMainFile(File file) {
        try (PrintWriter pr = new PrintWriter(file)) {

            pr.append("public class Main {\n" +
                    "    public static void main(String[] args) {\n");
            pr.append("\t\tCG();\n");
            pr.append("\t\tmyPrint();\n");
            pr.append("\t}\n");


            // Code Generation function
            pr.append("\tpublic static void CG(){\n");


            pr.append("\t}\n");


            // Code Generation function myPrint
            pr.append("\tpublic static void myPrint(){\n");
            for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                if (Main.symbolTable.getDeclaredTypes().get(i).getTypeCG().equals("var")) {
                    object = Main.symbolTable.getDeclaredTypes().get(i).getName().substring(0, Main.symbolTable.getDeclaredTypes().get(i).getName().length() - 1);
                    pr.append("\t\t" + Main.symbolTable.getDeclaredTypes().get(i).getName() + " " + object + " = new " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "();\n");
                    pr.append("\t\t" + object + "." + "getData();\n");

                }
            }
            pr.append("\t\tfor (int i = 0; i < " + object + ".data.size(); i++) {\n");
            pr.append("\t\tSystem.out.println(");
            int  x= 0;
            if(list.size() > 0){
                for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                    if (Main.symbolTable.getDeclaredTypes().get(i).getTypeCG().equals("var")) {
                        if (Main.symbolTable.getScopes() != null ) {
                            for (int i1 = 0; i1 < Main.symbolTable.getScopes().size(); i1++) {
                                if (Main.symbolTable.getScopes().get(i1).getParent() != null) {
                                    if (Main.symbolTable.getScopes().get(i1).getParent().getId().equals(Main.symbolTable.getDeclaredTypes().get(i).getName())) {

                                        for (int j = 0; j < Main.symbolTable.getScopes().get(i1).getSymbols().size(); j++) {
                                            if (Main.symbolTable.getScopes().get(i1).getSymbols().get(j).getType().getName().equals("columnName")) {
                                                x++;
                                                pr.append(object + ".data.get(i)." + Main.symbolTable.getScopes().get(i1).getSymbols().get(j).getName());
                                                if (x != list.size() ) {
                                                    pr.append("+\" \"+");
                                                }
                                            }
                                        }


                                    }
                                }
                            }
                        }
                    }
                }
            }else {
                AtomicInteger count= new AtomicInteger();
                Mycolumns.forEach((key, value) -> {
                    count.getAndIncrement();
                    pr.append(object + ".data.get(i)." + key);
                    if (count.get() != Mycolumns.size()  ) {
                        pr.append("+\" \"+");
                    }

                });

            }
            pr.append(");\n");
            pr.append("\t\t}\n");
            pr.append("\t}\n");


            pr.append("}\n");

            pr.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
