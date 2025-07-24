package com.example.day15;

public class Main {

    public static void main(String[] args){
        DataHolder<String> stringValue = new DataHolder<String>("Ryan Pugh");
        DataHolder<Integer> intValue = new DataHolder<Integer>(22);

        stringValue.printClassName();
        intValue.printClassName();
    }
}
