package com.example.payment;

public class Main {

    public static void checkout(PaymentProcessor processor, double amount){
        processor.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new CreditCardProcessor();
        checkout(processor, 50);
        PaymentProcessor processor1 = new PayPal();
        checkout(processor1, 60);
    }
}
