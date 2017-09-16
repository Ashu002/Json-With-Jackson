package jsonwithjackson.serialization;

import com.fasterxml.jackson.annotation.JsonInclude;
//@JsonInclude is used to exclude properties with empty/null/default values.
//The @JsonFormat annotation can be used to specify a format when serializing Date/Time values.

/*Jackson also allows configuring this behavior globally on the ObjectMapper:
        objectMapper.setSerializationInclusion(Include.NON_NULL);*/

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonIncludeBean {
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
