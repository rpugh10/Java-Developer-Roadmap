package com.example.day9;

public class FlyableMain {

    public static void main(String[] args)
    {
        Flyable[] fly = new Flyable[3];
        fly[0] = new Bird();
        fly[1] = new Plane();
        fly[2] = new Bird();

        for(Flyable f: fly)
        {
            f.fly();
        }
    }
}
