package jsonwithjackson.serialization;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonwithjackson.serialization.TypeEnumWithValue;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TypeEnumWithValueTest {
    @Test
    public void whenSerializingUsingJsonValue_thenCorrect()
            throws JsonParseException, IOException {
        String enumAsString =
                new ObjectMapper().writeValueAsString(TypeEnumWithValue.TYPE1);
        System.out.println(enumAsString);
        Assert.assertThat(enumAsString, Is.is("\"Type A\""));
    }
}
