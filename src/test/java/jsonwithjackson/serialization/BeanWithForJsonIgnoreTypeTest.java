package jsonwithjackson.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BeanWithForJsonIgnoreTypeTest {
    @Test
    public void test() throws IOException {
        BeanWithForJsonIgnoreType beanWithForJsonIgnoreType = new BeanWithForJsonIgnoreType();
        beanWithForJsonIgnoreType.setName("Hank");
        BeanWithJsonIgnoreType beanWithJsonIgnoreType = new BeanWithJsonIgnoreType();
        beanWithJsonIgnoreType.setFirstName("Steve");
        beanWithForJsonIgnoreType.setBeanWithJsonIgnoreType(beanWithJsonIgnoreType);

        String out = new ObjectMapper().writeValueAsString(beanWithForJsonIgnoreType);
        Assert.assertThat(out, Is.is("{\"name\":\"Hank\"}"));
        Assert.assertThat(out, IsNot.not(CoreMatchers.containsString("Steve")));

    }
}
