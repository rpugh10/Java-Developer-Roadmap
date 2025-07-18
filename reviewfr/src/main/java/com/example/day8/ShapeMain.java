package com.example.day8;

public class ShapeMain {


    public static void main(String[] args) {
    
    Shape[] shapes = new Shape[3];

    shapes[0] = new Circle("Circle", 34);
    shapes[1] = new Rectangle("Rectangle", 3, 4);
    shapes[2] = new Circle("Circle", 3);

    for(Shape s: shapes)
    {
        System.out.println(s.getArea());
    }
    }
}
