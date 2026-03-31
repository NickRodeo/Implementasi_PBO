public class Cash extends Payment {
    float cashTendered;

    // Constructor
    public Cash(float amount, float cashTendered) {
        super(amount);
        this.cashTendered = cashTendered;
    }
}