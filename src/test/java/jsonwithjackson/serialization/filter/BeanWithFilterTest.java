package jsonwithjackson.serialization.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BeanWithFilterTest {
    @Test
    public void test() throws IOException {
        BeanWithFilter beanWithFilter = new BeanWithFilter();
        beanWithFilter.setId(1);
        beanWithFilter.setName("bhushan");

        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("beanFilter", SimpleBeanPropertyFilter.filterOutAllExcept("name"));
        String result = new ObjectMapper().writer(filterProvider).writeValueAsString(beanWithFilter);
        Assert.assertThat(result, IsNot.not(CoreMatchers.containsString("1")));
        Assert.assertThat(result, CoreMatchers.containsString("bhushan"));
        Assert.assertThat(result, Is.is("{\"name\":\"bhushan\"}"));

    }
}
