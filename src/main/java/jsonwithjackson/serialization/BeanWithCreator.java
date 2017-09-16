package jsonwithjackson.serialization;


/*
* The @JsonCreator annotation is used to tune the constructor/factory used in deserialization.
*It’s very helpful when we need to deserialize some JSON that doesn’t exactly match the
*target entity we need to get
*/

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BeanWithCreator {
    private Integer id;
    private String name;

    @JsonCreator
    public BeanWithCreator(@JsonProperty("serialNumber") Integer id, @JsonProperty("serialName") String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;

    }

    @Override
    public String toString() {
        return "BeanWithCreator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
