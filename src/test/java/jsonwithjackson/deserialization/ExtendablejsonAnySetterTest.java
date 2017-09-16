package jsonwithjackson.deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class ExtendablejsonAnySetterTest {
    @Test
    public  void  test() throws Exception {
        String json = "{\"address\":\"My address\",\"attr2\":\"val2\",\"attr1\":\"val1\"}";
        ExtendablejsonAnySetter extendablejsonAnySetter =
                new ObjectMapper().reader(ExtendablejsonAnySetter.class).readValue(json);
        Assert.assertThat(extendablejsonAnySetter.getAddress(), Is.is("My address"));
        Assert.assertThat(extendablejsonAnySetter.getProperties().size(), Is.is(2));
    }
}
