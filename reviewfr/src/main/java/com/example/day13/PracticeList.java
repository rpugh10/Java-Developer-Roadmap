package com.example.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeList {

    public static void main(String[] args) {
        String title;
        List<String> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many books do you want to add: ");
        int input = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < input; i++){
            System.out.println("Enter book title: ");
            title = scan.nextLine();
            books.add(title);
        }

        System.out.println("Enter title to remove: ");
        String remove = scan.nextLine();

        if (books.contains(remove)){
            books.remove(remove);
        }else{
            System.out.println(remove + " is not in the list");
        }


        for(String book: books){
            System.out.println(book);
        }
    }
}
