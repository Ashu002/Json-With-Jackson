package jsonwithjackson.serialization.jsonroot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UserWithRootTest {
    @Test
    public void test() throws IOException {
        UserWithRoot withRoot = new UserWithRoot(10, "Bhushan");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String output = objectMapper.writeValueAsString(withRoot);
        System.out.println(output);
        Assert.assertThat(output, CoreMatchers.containsString("Bhushan"));
        Assert.assertThat(output, CoreMatchers.containsString("10"));
    }
}