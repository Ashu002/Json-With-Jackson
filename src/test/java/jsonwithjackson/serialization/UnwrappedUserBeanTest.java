package jsonwithjackson.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UnwrappedUserBeanTest {
    @Test
    public void test() throws IOException {
        UnwrappedUserBean unwrappedUserBean = new UnwrappedUserBean();
        unwrappedUserBean.setId(1);
        UnwrappedUserBean.Name name =new UnwrappedUserBean.Name();
        name.setFirstName("Acb");
        name.setLastName("Las");
        unwrappedUserBean.setName(name);
        UnwrappedUserBean.Address address = new UnwrappedUserBean.Address();
        address.setFirstAddress("aks");
        address.setMobileNumber("111111111");
        unwrappedUserBean.setAddress(address);

        String out = new ObjectMapper().writeValueAsString(unwrappedUserBean);
        System.out.println(out);
        Assert.assertThat(out, Is.is("{\"id\":1,\"firstName\":\"Acb\",\"lastName\":\"Las\",\"address\":{\"firstAddress\":\"aks\",\"mobileNumber\":\"111111111\"}}"));

    }
}
