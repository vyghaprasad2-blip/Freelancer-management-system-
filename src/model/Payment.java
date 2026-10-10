package model;

public abstract class Payment {

    private int paymentId;
    private double amount;
    private String status;

    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "Pending";
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    public abstract void processPayment();

    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Payment Status: " + status);
    }
}