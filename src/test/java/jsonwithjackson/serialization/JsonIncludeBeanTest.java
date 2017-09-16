package jsonwithjackson.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class JsonIncludeBeanTest  {
    @Test
    public void test() throws IOException {
        JsonIncludeBean jsonIncludeBean = new JsonIncludeBean();
        jsonIncludeBean.setId(1);
        jsonIncludeBean.setName(null);
        String output = new ObjectMapper().writeValueAsString(jsonIncludeBean);
        System.out.println(output);
    }
}
