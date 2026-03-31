import java.util.ArrayList;
import java.util.List;

public class Item {
    float weight;
    String description;
    private List<OrderDetail> orderDetails;

    public Item(float weight, String description) {
        this.weight = weight;
        this.description = description;

        //Bentuk relasi (item mempunyai 0 atau lebih OrderDetail)
        this.orderDetails = new ArrayList<>();
    }
    
    public void getPriceForQuantity(){

    }

    public void getWeight(){

    }

    //Method buat menambahkan OrderDetail
    public void addOrderDetail(OrderDetail detail) {
        orderDetails.add(detail);
    }
    
}