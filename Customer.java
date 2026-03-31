public class Customer {
    String name;
    String deliveryAddress;
    String contact;
    boolean active;

    public Customer(String name, String deliveryAddress, String contact, boolean active) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.contact = contact;
        this.active = active;
    }
}