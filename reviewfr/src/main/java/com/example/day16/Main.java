package com.example.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<String> users = new ArrayList<>();

        System.out.println("How many names do you want to enter: ");
        int input = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < input; i++){
            System.out.println("Enter names: ");
            String name = scan.nextLine();
            users.add(name);
        }

        System.out.println("Sorting names");
        users.sort((a, b) -> a.compareTo(b));

        System.out.println("Converting to a stream");
        users.stream()
            .filter(user -> user.length() >= 4)
            .map(user -> user.toUpperCase())
            .forEach(System.out::println);
    }
}
