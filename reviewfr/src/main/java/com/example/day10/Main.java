package com.example.day10;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Ryan", 100);
        System.out.println("Trying to withdraw 10,000 from " + bankAccount.getOwnerName() + "'s account");

        try {
            bankAccount.withdraw(10000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
