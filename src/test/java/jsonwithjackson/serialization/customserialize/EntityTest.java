package jsonwithjackson.serialization.customserialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EntityTest {

    @Test
    public void whenSerializingUsingJsonSerialize() throws IOException, ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = "02-06-2017";
        Date date = dateFormat.parse(dateString);
        Entity entity = new Entity("My Event", date);
        ObjectMapper  objectMapper = new ObjectMapper();
        String output = objectMapper.writeValueAsString(entity);
        System.out.println(output);
        Assert.assertThat(output, CoreMatchers.containsString("My Event"));
        Assert.assertThat(output, CoreMatchers.containsString("02-06-2017"));
    }

    @Test
    public void testWithDifferentDateFormat() throws IOException, ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM");
        String dateString = "2017-23-11";
        Date date = dateFormat.parse(dateString);
        Entity entity = new Entity("My Event", date);
        ObjectMapper objectMapper = new ObjectMapper();
        String output = objectMapper.writeValueAsString(entity);
        System.out.println(output);
        Assert.assertThat(output, CoreMatchers.containsString("23-11-2017"));
    }


}
