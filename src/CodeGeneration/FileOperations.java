package CodeGeneration;

import Java.Main;
import Java.SymbolTable.Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FileOperations {

    public void writeFile(File file, Map<String, Type> columns, Type tableName) {
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
            if (columns.size() > 0) {
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
                            pr.append("attributes[" + i + "]");
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


            pr.append("}");
            pr.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeMainFile(File file) {
        try (PrintWriter pr = new PrintWriter(file)) {

            pr.append("public class Main {\n" +
                    "    public static void main(String[] args) {\n");
            pr.append("\t\tCG();\n");
            pr.append("\t}\n");

            // Code Generation function
            pr.append("\tpublic static void CG(){\n");
            for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                if(Main.symbolTable.getDeclaredTypes().get(i).getPath() != null ){
                    String  object = Main.symbolTable.getDeclaredTypes().get(i).getName().substring(0, Main.symbolTable.getDeclaredTypes().get(i).getName().length() - 1);
                    pr.append("\t\t"+ Main.symbolTable.getDeclaredTypes().get(i).getName()+" "+ object + " = new "+Main.symbolTable.getDeclaredTypes().get(i).getName()+"();\n");
                    pr.append("\t\t"+object+"."+"load();\n");
                    pr.append("\t\t System.out.println(user.data.size());\n");
                }
            }

            for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                if(Main.symbolTable.getDeclaredTypes().get(i).getName().contains("_") ){
            String  object = Main.symbolTable.getDeclaredTypes().get(i).getName().substring(0, Main.symbolTable.getDeclaredTypes().get(i).getName().length() - 1);
                    pr.append("\t\t"+ Main.symbolTable.getDeclaredTypes().get(i).getName()+" "+ object + " = new "+Main.symbolTable.getDeclaredTypes().get(i).getName()+"();\n");


                }
            }


            pr.append("\t}\n");






            pr.append("}\n");

            pr.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
