<<<<<<< HEAD
package com.example.day8;

public class AnimalMain {

    public static void main(String[] args)
    {
         Animal[] animals = new Animal[3];

        animals[0] = new Dog("Jeff");
        animals[1] = new Cat("Bob");
        animals[2] = new Dog("Hatty");
        
        for(Animal a: animals){
            if (a != null) {
                a.makeSound();
            }
        }
    }
=======
package com.example.day8;

public class AnimalMain {

    public static void main(String[] args)
    {
         Animal[] animals = new Animal[3];

        animals[0] = new Dog("Jeff");
        animals[1] = new Cat("Bob");
        animals[2] = new Dog("Hatty");
        
        for(Animal a: animals){
            if (a != null) {
                a.makeSound();
            }
        }
    }
>>>>>>> ce4b1b60a34b6312940fe5ce1b4b38add38cf964
}