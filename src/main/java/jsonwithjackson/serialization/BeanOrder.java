package jsonwithjackson.serialization;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//The @JsonPropertyOrder annotation is used to specify the order of properties on serialization.
@JsonPropertyOrder({"id","name"})
public class BeanOrder {
    private String name;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
