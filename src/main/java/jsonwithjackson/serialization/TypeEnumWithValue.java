package jsonwithjackson.serialization;


import com.fasterxml.jackson.annotation.JsonValue;

public enum  TypeEnumWithValue {
    TYPE1(1, "Type A"), TYPE2(2, "Type B");

    TypeEnumWithValue(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private Integer id;
    private String name;

    @JsonValue
    public String getName() {
        return name;
    }
}