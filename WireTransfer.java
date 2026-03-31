public class WireTransfer extends Payment {
    String bankID;
    String bankName;

    // Constructor
    public WireTransfer(float amount, String bankID, String bankName) {
        super(amount);
        this.bankID = bankID;
        this.bankName = bankName;
    }
}