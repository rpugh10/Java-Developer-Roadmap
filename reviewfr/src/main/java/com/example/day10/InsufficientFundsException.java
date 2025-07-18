package com.example.day10;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
