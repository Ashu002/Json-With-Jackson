package jsonwithjackson.serialization;

import com.fasterxml.jackson.annotation.JsonRawValue;

//@JsonRawValue is used to instruct the Jackson to serialize a property exactly as is.
public class RawValue {
    private String id;
    @JsonRawValue
    private String rowData;

    public RawValue(String id, String rowData) {
        this.id = id;
        this.rowData = rowData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRowData() {
        return rowData;
    }

    public void setRowData(String rowData) {
        this.rowData = rowData;
    }
}
