<<<<<<< HEAD
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
=======
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
>>>>>>> ce4b1b60a34b6312940fe5ce1b4b38add38cf964
