package com.example.payment;

public class CreditCardProcessor implements PaymentProcessor{

    public void processPayment(double amount){
        System.out.println("Processing $" + amount + " with credit card");
    }
}
