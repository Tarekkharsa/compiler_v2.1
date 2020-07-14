package Java.SymbolTable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Type {

    private String name;
    private String path;
    private String fileType;
    private String typeNum;
    private Map<String, Type> columns = new LinkedHashMap<>();

    public String getTypeCG() {
        return typeNum;
    }

    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum;
    }

    public final static String NUMBER_CONST = "number";
    public final static String STRING_CONST = "string";
    public final static String BOOLEAN_CONST = "boolean";


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Type> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, Type> columns) {
        this.columns = columns;
    }

}
