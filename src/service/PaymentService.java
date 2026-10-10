package service;

import model.Payment;
import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private List<Payment> payments = new ArrayList<>();

    public void makePayment(Payment payment) {
        payment.processPayment();
        payments.add(payment);
        System.out.println("Payment recorded successfully!");
    }

    public void viewPayments() {
        if (payments.isEmpty()) {
            System.out.println("No payments recorded.");
            return;
        }

        for (Payment payment : payments) {
            payment.displayPayment();
            System.out.println("----------------------");
        }
    }
}