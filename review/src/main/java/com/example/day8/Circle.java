<<<<<<< HEAD
package com.example.day8;

public class Circle extends Shape{

    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
=======
package com.example.day8;

public class Circle extends Shape{

    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
>>>>>>> ce4b1b60a34b6312940fe5ce1b4b38add38cf964
}