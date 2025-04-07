package inheritance;

import java.util.List;

public class Customer extends Person {
    private int customerNumber;
    private List<Addresse> addresses;
    //This constructor uses the default constructor from Person class
    public Customer(int customerNumber, String firstName, String lastName) {
        this.customerNumber = customerNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(int i, int customerNumber) {
        //This uses the second constructor and
        // therefore needs to call the int variable present in the Person class.
        super(i);
        this.customerNumber = customerNumber;
    }

    public void addAddress (Addresse a) {
        addresses.add(a);
    }

    public List<Addresse> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Addresse> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
