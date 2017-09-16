package jsonwithjackson.serialization.jsonroot;

public class Role {
    String authority;

    public Role(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
