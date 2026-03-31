import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String deliveryAddress;
    String contact;
    boolean active;
    private List<Order> orders;

    public Customer(String name, String deliveryAddress, String contact, boolean active) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.contact = contact;
        this.active = active;
        //Bentuk relasi (Customer mempunyai 0 atau lebih OrderDetail)
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

}