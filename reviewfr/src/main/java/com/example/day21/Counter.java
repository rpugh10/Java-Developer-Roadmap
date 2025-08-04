package com.example.day21;

public class Counter {

    public int count = 0;

    public synchronized void increment(){
        count++;
    }
}
