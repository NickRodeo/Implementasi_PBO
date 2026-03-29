public enum OrderStatus {
    CREATE(0),
    SHIPPING(1),
    DELIVERED(2),
    PAID(3);

    private int code;

    //Constructor and Setter
    OrderStatus(int code) {
        this.code = code;
    }

    //Getter
    public int getCode() {
        return code;
    }
}
