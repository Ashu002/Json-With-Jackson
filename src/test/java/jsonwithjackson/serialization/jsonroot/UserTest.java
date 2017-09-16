package jsonwithjackson.serialization.jsonroot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UserTest {
    @Test
    public void test() throws IOException {
        Role role = new Role("akka");
        Role role2 = new Role("akka2");
        Role[] roles = {role, role2};
        User user = new User("Hank", roles);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String output = objectMapper.writeValueAsString(user);
        System.out.println(output);
        Assert.assertThat(output, CoreMatchers.containsString("akka"));
        Assert.assertThat(output, CoreMatchers.containsString("Hank"));
    }
}
