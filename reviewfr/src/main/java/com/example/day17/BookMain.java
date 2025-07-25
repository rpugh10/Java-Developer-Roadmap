package com.example.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
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

        OptionalDouble average = books.stream()
            .mapToInt(Book::getNumberOfPages)
            .average();

            if(average.isPresent()){
                System.out.println("Average pages: " + average.getAsDouble());
            }

        long count = books.stream()
            .filter(book ->book.getNumberOfPages() > 300)
            .count();

            System.out.println("Number of books with more than 300 pages: " + count);
        
        List<String> titles = books.stream()
            .map(Book::getTitle)
            .toList();

        System.out.println("Book titles: " + titles);

        books.stream()
            .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
            .forEach(book -> System.out.println(book.getTitle()));
    }
}
