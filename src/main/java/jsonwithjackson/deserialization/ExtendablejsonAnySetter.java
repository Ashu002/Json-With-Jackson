package jsonwithjackson.deserialization;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

/*
* @JsonAnySetter allows you the flexibility of using a Map as standard properties. On de-
*serialization, the properties from JSON will simply be added to the map.
*/
public class ExtendablejsonAnySetter {
    private String address;
    @JsonAnySetter
    private Map<String, String> properties = new HashMap<String, String>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    @JsonAnySetter
    public void setProperties(String key, String value) {
        this.properties.put(key, value);
    }

    @Override
    public String toString() {
        return "ExtendablejsonAnySetter{" +
                "address='" + address + '\'' +
                ", properties=" + properties +
                '}';
    }
}
