package com.example.day16;

public class Book implements Comparable<Book>{
    private String title;
    private int numberOfPages;
    
    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", numberOfPages=" + numberOfPages + "]";
    }

    @Override
    public int compareTo(Book other){
        return Integer.compare(this.numberOfPages, other.numberOfPages);
    }
}
