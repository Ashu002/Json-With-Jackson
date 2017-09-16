package jsonwithjackson.serialization.jsonroot;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

//The @JsonRootName annotation is used – if wrapping is enabled – to specify the name of the
//root wrapper to be used.
@JsonRootName(value = "user")
public class User {
    String name ;

    public User(String name, Role[] role) {
        this.name = name;
        this.role = role;
    }

    @JsonProperty(value = "roles")
    public Role[] getRole() {
        return role;
    }

    public void setRole(Role[] role) {
        this.role = role;
    }

    Role role[];
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
