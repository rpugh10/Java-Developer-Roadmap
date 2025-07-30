package com.example.day19;
import java.util.HashSet;
import java.util.Scanner;
public class fruitName {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashSet<String> fruits = new HashSet<>();
        int count = 0;

        do { 
            System.out.println("Enter a fruit: ");
            String input = scan.nextLine();
            fruits.add(input);
            count++;
        } while (count < 5);

        System.out.println(fruits);
    }
}
