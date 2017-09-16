package jsonwithjackson.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class RawValueTest {
    @Test
    public void test() throws IOException {
        RawValue rawValue = new RawValue("My bean", "{\"attr\":false}");
        String string = new ObjectMapper().writeValueAsString(rawValue);
        System.out.println(string);
        Assert.assertThat(string, CoreMatchers.containsString("{\"attr\":false}"));
    }
}
