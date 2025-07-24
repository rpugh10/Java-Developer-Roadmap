package com.example.day15;

public class DataHolder<T> {

    private T value;

    public DataHolder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void printClassName(){
        System.out.println(value.getClass().getName());
    }
}
