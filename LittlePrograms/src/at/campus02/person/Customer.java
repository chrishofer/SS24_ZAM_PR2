package at.campus02.person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
    private int customerNumber;
    private List<Address> addresses;
    public Customer(String firstName, String lastName, int customerNumber) {
        super(firstName, lastName);
        this.customerNumber = customerNumber;
        addresses = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                '}';
    }

    public void addAddress(Address ad){
        addresses.add(ad);
    }
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
