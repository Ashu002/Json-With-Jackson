package jsonwithjackson.serialization;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
//@JsonUnwrapped is used to define that a value should be unwrapped / flattened when
//serialized.
public class UnwrappedUserBean {
    private int id;
    @JsonUnwrapped
    private Name name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public static class Name {
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    public static class Address {
        private String firstAddress;
        private String mobileNumber;

        public String getFirstAddress() {
            return firstAddress;
        }

        public void setFirstAddress(String firstAddress) {
            this.firstAddress = firstAddress;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }
    }
}

