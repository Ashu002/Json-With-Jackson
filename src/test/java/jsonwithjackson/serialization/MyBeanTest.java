package jsonwithjackson.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyBeanTest {

    @Test
    public void test() throws JsonProcessingException, IOException {
        MyBean myBean = new MyBean();
        myBean.setName("test");
        Map<String, String> map = new HashMap<String, String>();
        map.put("var1", "123000");
        map.put("var2", "1230020");
        myBean.setProperties(map);

        String result = new ObjectMapper().writeValueAsString(myBean);
        System.out.println(result);
        assert(result != null);
        Assert.assertThat(result, CoreMatchers.containsString("123000"));
    }
}
