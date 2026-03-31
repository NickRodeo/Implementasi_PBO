public class OrderDetail{

    int qty;
    String taxStatus;
    Item item;
    Order order;
    
    public OrderDetail(int qty, String taxStatus, Item item, Order order){
        this.qty = qty;
        this.taxStatus = taxStatus;
        
        //Bentuk relasi (OrderDetail mempunyai tepat 1 Item)
        this.item = item; 
        //Bentuk relasi (OrderDetail mempunyai tepat 1 Order)
        this.order = order; 
    }

    public void calculateSubTotal(){

    }

    public void calculateWeight(){

    }

}
