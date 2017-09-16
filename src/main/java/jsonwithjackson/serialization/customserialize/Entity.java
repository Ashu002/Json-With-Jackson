package jsonwithjackson.serialization.customserialize;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

//@JsonSerialize is used to indicate a custom serializer will be used to marshall the entity.
public class Entity {
    public Entity(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @JsonSerialize(using = CustomDateSerialize.class)
    private Date date;
}
