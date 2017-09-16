package jsonwithjackson.serialization;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
// @JsonProperty is used to indicate the property name in JSON.
//
public class FormatAndProperty {
    @JsonProperty("name")
    private String kName;

    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "dd-MM-yyyy")
    @JsonProperty("date")
    private Date kDate;

    public FormatAndProperty(String kName, Date kDate) {
        this.kName = kName;
        this.kDate = kDate;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public Date getkDate() {
        return kDate;
    }

    public void setkDate(Date kDate) {
        this.kDate = kDate;
    }
}
