package com.example.day16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BookMain {

    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.println("Enter number of books: ");
        int input = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < input; i++){
            
            System.out.println("Enter book title and # of pages: ");
            String title = scan.nextLine();
            int pages = scan.nextInt();
            scan.nextLine();

            Book book = new Book(title, pages);
            books.add(book);
        }

        books.sort((a, b) -> a.compareTo(b));

        books.stream()
        .forEach(System.out::println);
    }  
}
