package Java.AST.Function.Json;

import java.util.ArrayList;
import java.util.List;

public class Json_obj {
    private String Identifier;
    private String ORM;
    private List<Json_attribute> json_attributes;
    private List<Json_obj> json_objs;
    private List<Json_array> json_arrays;

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getORM() {
        return ORM;
    }

    public void setORM(String ORM) {
        this.ORM = ORM;
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
