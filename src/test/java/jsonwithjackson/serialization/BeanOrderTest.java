package jsonwithjackson.serialization;


import com.fasterxml.jackson.databind.ObjectMapper;
import jsonwithjackson.serialization.BeanOrder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BeanOrderTest {

    @Test
    public void test() throws IOException{
        BeanOrder beanOrder = new BeanOrder();
        beanOrder.setId(1l);
        beanOrder.setName("Bhushan");

        String result  = new ObjectMapper().writeValueAsString(beanOrder);
        System.out.println(result);
        Assert.assertNotNull("Result will not null",result);
        Assert.assertTrue("First property key start with", result.startsWith("{\"id\":1,"));
        Assert.assertTrue("result end with", result.endsWith("\"Bhushan\"}"));
    }


}
