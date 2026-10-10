package model;

public class UPIPayment extends Payment {

    private String upiId;

    public UPIPayment(int paymentId, double amount, String upiId) {
        super(paymentId, amount);
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public void processPayment() {
        setStatus("Successful");
        System.out.println("UPI payment simulated successfully!");
        System.out.println("UPI ID: " + upiId);
    }

    @Override
    public void displayPayment() {
        super.displayPayment();
        System.out.println("Payment Method: UPI");
        System.out.println("UPI ID: " + upiId);
    }
}