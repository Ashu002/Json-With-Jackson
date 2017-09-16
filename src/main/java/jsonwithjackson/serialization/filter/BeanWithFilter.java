package jsonwithjackson.serialization.filter;

import com.fasterxml.jackson.annotation.JsonFilter;

//The @JsonFilter annotation specifies a filter to be used during serialization.
@JsonFilter("beanFilter")
public class BeanWithFilter {
    private int id;
    private String name;

    public int getId() {
        return id;
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
