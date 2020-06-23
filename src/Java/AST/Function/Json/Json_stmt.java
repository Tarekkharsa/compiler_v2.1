package Java.AST.Function.Json;

import Java.AST.QueryStmt.AnyName;

import java.util.List;

public class Json_stmt {
    private AnyName anyName;
    private List<Json_attribute> json_attributes;
    private List<Json_obj> json_objs;
    private List<Json_array> json_arrays;
    private String K_var;

    public String getAssign() {
        return Assign;
    }

    public void setAssign(String assign) {
        Assign = assign;
    }

    private String Assign;

    public String getK_var() {
        return K_var;
    }

    public void setK_var(String k_var) {
        K_var = k_var;
    }

    public AnyName getAnyName() {
        return anyName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public List<Json_attribute> getJson_attributes() {
        return json_attributes;
    }

    public void setJson_attributes(List<Json_attribute> json_attributes) {
        this.json_attributes = json_attributes;
    }

    public List<Json_obj> getJson_objs() {
        return json_objs;
    }

    public void setJson_objs(List<Json_obj> json_objs) {
        this.json_objs = json_objs;
    }

    public List<Json_array> getJson_arrays() {
        return json_arrays;
    }

    public void setJson_arrays(List<Json_array> json_arrays) {
        this.json_arrays = json_arrays;
    }
}
