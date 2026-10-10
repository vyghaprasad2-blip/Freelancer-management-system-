package model;

public class CardPayment extends Payment {

    private String cardHolderName;
    private String lastFourDigits;

    public CardPayment(int paymentId, double amount,
                       String cardHolderName,
                       String lastFourDigits) {
        super(paymentId, amount);
        this.cardHolderName = cardHolderName;
        this.lastFourDigits = lastFourDigits;
    }

    @Override
    public void processPayment() {
        setStatus("Successful");
        System.out.println("Card payment simulated successfully!");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card ending in: " + lastFourDigits);
    }

    @Override
    public void displayPayment() {
        super.displayPayment();
        System.out.println("Payment Method: Card");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card ending in: " + lastFourDigits);
    }
}