package jsonwithjackson.customannotation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BeanWithMyCustomAnnotationTest {
    @Test
    public void test() throws IOException {
        BeanWithMyCustomAnnotation beanWithMyCustomAnnotation = new BeanWithMyCustomAnnotation();
        beanWithMyCustomAnnotation.setDateCreated(null);
        beanWithMyCustomAnnotation.setId(1);
        beanWithMyCustomAnnotation.setName("Akshay");

        String output = new ObjectMapper().writeValueAsString(beanWithMyCustomAnnotation);
        System.out.println(output);
        Assert.assertThat(output, Is.is("{\"name\":\"Akshay\",\"id\":1}"));
    }
}
