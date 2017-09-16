package jsonwithjackson.serialization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
* The @JsonIgnore annotation is used to mark a property to be ignored at the field level.
*@JsonIgnoreProperties – one of the most common annotations in Jackson – is used to mark a
*property or a list of properties to be ignored at the class level.
* */
@JsonIgnoreProperties({"id"})
public class EntityWithJsonIgnore {
    private String id;
    private String name;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @JsonIgnore
    private String role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
