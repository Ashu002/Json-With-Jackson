package jsonwithjackson.serialization.jsonroot;

import com.fasterxml.jackson.annotation.JsonRootName;

//The @JsonRootName annotation is used – if wrapping is enabled – to specify the name of the
//root wrapper to be used.
@JsonRootName(value = "user")
public class UserWithRoot {
    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public UserWithRoot(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
