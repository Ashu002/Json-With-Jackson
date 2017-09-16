package jsonwithjackson.serialization;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.Map;
/*The @JsonGetter annotation is an alternative to @JsonProperty annotation to mark the
specified method as a getter method.
The @JsonAnyGetter annotation allows the flexibility of using a Map field as standard
properties.*/
public class MyBean {
    private String name;
    private Map<String, String> properties;

    @JsonGetter("firstName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
