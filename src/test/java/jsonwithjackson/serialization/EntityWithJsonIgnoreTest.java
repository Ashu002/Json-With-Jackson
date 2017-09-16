package jsonwithjackson.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class EntityWithJsonIgnoreTest {
    @Test
    public void test()
            throws JsonProcessingException, IOException {
        EntityWithJsonIgnore entityWithJsonIgnore = new EntityWithJsonIgnore();
        entityWithJsonIgnore.setId("1");
        entityWithJsonIgnore.setName("2-C");
        entityWithJsonIgnore.setRole("TK");

       String out = new ObjectMapper().writeValueAsString(entityWithJsonIgnore);
       System.out.println(out);
       Assert.assertThat(out, CoreMatchers.is("{\"name\":\"2-C\"}"));
       Assert.assertThat(out, IsNot.not(CoreMatchers.containsString("TK")));
       Assert.assertThat(out, IsNot.not(CoreMatchers.containsString("1")));
    }
}
