package FileHandling;

import java.io.Serializable;

public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    String city;
    String state;
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
    void display() {
        System.out.println("City  : " + city);
        System.out.println("State : " + state);
    }
}
