package com.example.payment;

public class PayPal implements PaymentProcessor{

    public void processPayment(double amount){
        System.out.println("Processing $" + amount + " with PayPal");
    }
}
