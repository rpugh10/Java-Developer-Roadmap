package com.example.day18;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        try{
            if(age < 18){
                throw new InvalidAgeException("Age must be over 18");
            }
            else{
                System.out.println("Access granted");
            }
        }catch(InvalidAgeException e){
            e.printStackTrace();
        }

    }
}
