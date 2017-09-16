package jsonwithjackson.serialization;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
//@JsonIgnoreType is used to mark all properties of annotated type to be ignored.
@JsonIgnoreType
public class BeanWithJsonIgnoreType {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
