import java.util.Date;

public class Credit extends Payment {

    String number;
    String type;
    Date expireDate;

    // Constructor
    public Credit(float amount, String number, String type, Date expireDate) {
        super(amount);
        this.number = number;
        this.type = type;
        this.expireDate = expireDate;
    }
}