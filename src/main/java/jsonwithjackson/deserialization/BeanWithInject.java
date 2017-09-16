package jsonwithjackson.deserialization;
/*@JacksonInject is used to indicate a property that will get its value from injection and not
        from the JSON data.*/


import com.fasterxml.jackson.annotation.JacksonInject;

public class BeanWithInject {
    @JacksonInject
    private  int id;
    private String name;

    public BeanWithInject() {
    }

    public BeanWithInject(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
