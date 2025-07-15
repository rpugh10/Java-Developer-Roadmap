package com.example.day8;

public abstract class Shape {

    public abstract double getArea();

    private String name;

    public Shape(String name){
        this.name = name;
    }
}
