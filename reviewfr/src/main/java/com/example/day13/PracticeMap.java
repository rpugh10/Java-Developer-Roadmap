package com.example.day13;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PracticeMap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> ageMap = new HashMap<>();

        System.out.println("How many names do you want to add: ");
        int input = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < input; i++){
            System.out.println("Enter a name and age: ");
            String name = scan.nextLine();
            int age = scan.nextInt();
            scan.nextLine();

            ageMap.put(name, age);
        }

        System.out.println("Ryan is " + ageMap.get("Ryan") + " years old");

        for (Map.Entry<String, Integer> en : ageMap.entrySet()) {
            System.out.println(en.getKey() + ": " + en.getValue());
        }

    }
}
