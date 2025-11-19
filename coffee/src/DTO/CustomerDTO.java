package DTO;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDTO implements Serializable,Comparable<String> {

    private String name;
    private String mobile;
    private String flavour;
    private String quantity;
    private String payment;

    public CustomerDTO(String name, String mobile, String flavour, String quantity, String payment){
        this.name = name;
        this.mobile = mobile;
        this.flavour = flavour;
        this.quantity = quantity;
        this.payment = payment;

    }
    @Override
    public String toString() {
        return "CustomerService{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", flavour='" + flavour + '\'' +
                ", quantity='" + quantity + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(mobile, that.mobile) && Objects.equals(flavour, that.flavour) && Objects.equals(quantity, that.quantity) && Objects.equals(payment, that.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobile, flavour, quantity, payment);
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
