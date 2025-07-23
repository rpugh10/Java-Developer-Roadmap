package com.example.day13;
import java.util.HashSet;
import java.util.Scanner;

public class PracticeSet {

    public static void main(String[] args){
        HashSet<String> username = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many usernames do you want to add: ");
        int input = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < input; i++){
            System.out.println("Enter username: ");
            String user = scan.nextLine();
            username.add(user);
        }

        System.out.println(username);


    }
}
