public class Check extends Payment {
    String name;
    String bankID;

    // Constructor
    public Check(float amount, String name, String bankID) {
        super(amount);
        this.name = name;
        this.bankID = bankID;
    }

    public void authorized() {

    }
}