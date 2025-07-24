package com.example.day15;
import java.util.Scanner;
public class PairMain {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Pair<String, Integer> value = new Pair<>("Ryan", 22);
        System.out.println(value.getKey() + " " + value.getValue());
        
        System.out.println("Enter a new key value and a new value: ");
        String name = scan.nextLine();
        int num = scan.nextInt();
        scan.nextLine();

        value = new Pair<>(name, num);

        System.out.println(value.getKey() + " " + value .getValue());
    }
}
