package jsonwithjackson.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatAndPropertyTest {
    @Test
    public void test() throws IOException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = simpleDateFormat.parse("12-04-2017");
        FormatAndProperty formatAndProperty = new FormatAndProperty("Ankit", date);
        String out = new ObjectMapper().writeValueAsString(formatAndProperty);
        Assert.assertThat(out, CoreMatchers.containsString("Ankit"));
        Assert.assertThat(out, CoreMatchers.containsString("name"));
        Assert.assertThat(out, CoreMatchers.containsString("{\"name\":\"Ankit\",\"date\":\"11-04-2017\"}"));
    }
}
