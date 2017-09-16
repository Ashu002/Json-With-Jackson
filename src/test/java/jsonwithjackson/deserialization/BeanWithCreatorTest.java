package jsonwithjackson.deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import jsonwithjackson.serialization.BeanWithCreator;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BeanWithCreatorTest {
    @Test
    public void test() throws IOException {
        String json = "{\"serialNumber\":1,\"serialName\":\"KILL\"}";
        BeanWithCreator beanWithCreator = new ObjectMapper().reader(BeanWithCreator.class).readValue(json);
        System.out.println(beanWithCreator);
        Assert.assertThat(beanWithCreator.getId(), Is.is(1));
        Assert.assertThat(beanWithCreator.getName(), Is.is("KILL"));
    }

    @Test
    public void testWithRealBeanFeildName() throws IOException {
        String json = "{\"id\":10,\"name\":\"LP\"}";
        BeanWithCreator beanWithCreator = new ObjectMapper().reader(BeanWithCreator.class).readValue(json);
        System.out.println(beanWithCreator);
        Assert.assertThat(beanWithCreator.getId(), Is.is(10));
        Assert.assertThat(beanWithCreator.getName(), Is.is("LP"));
    }

    @Test(expected = IOException.class)
    public void testInvalidJson() throws IOException {
        String json = "{\"notValidid\":1,\"name\":\"KILL\"}";
        BeanWithCreator beanWithCreator = new ObjectMapper().reader(BeanWithCreator.class).readValue(json);
    }
}
