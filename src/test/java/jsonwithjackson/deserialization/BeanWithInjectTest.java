package jsonwithjackson.deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BeanWithInjectTest {
    @Test
    public void whenDeserializingUsingJsonInject_thenCorrect()
            throws JsonProcessingException, IOException {
        String json = "{\"name\":\"My bean\"}";
        InjectableValues inject = new InjectableValues.Std().addValue(int.class, 1);
        BeanWithInject bean = new ObjectMapper().reader(inject).forType(BeanWithInject.class).readValue(json);
        Assert.assertEquals("My bean", bean.getName());
        Assert.assertEquals(1, bean.getId());
    }
}
