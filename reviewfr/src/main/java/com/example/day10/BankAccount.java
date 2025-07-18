package com.example.day10;

public class BankAccount {
    private String ownerName;
    private  double balance;

    public BankAccount(String ownerName, double balance)
    {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient funds. Available balance : $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: $" + balance);
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getBalance(){
        return balance;
    }
}
