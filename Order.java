import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    Date createDate;
    OrderStatus orderStatus;
    Customer customer;
    List<OrderDetail> orderDetails;
    List<Payment> payments;

     public Order(Date createDate, Customer customer) {
        this.createDate = createDate;
        this.customer = customer;
        this.orderStatus = OrderStatus.CREATE;
        this.orderDetails = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    //Method buat menambahkan OrderDetail
    public void addOrderDetail(OrderDetail detail) {
        orderDetails.add(detail);
    }

    //Method buat menambahkan Payment
    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    //Method untuk validasi OrderDetail dan Payment, dikarenakan bentuk relasi (Order mempunyai 1 atau lebih OrderDetail dan Payment)
    private void validate() {
        if (orderDetails.isEmpty()) {
            throw new IllegalStateException("Order kosong, tidak bisa checkout!");
        }

        if (payments.isEmpty()) {
            throw new IllegalStateException("Metode pembayaran tidak ada!");
        }
    }
}