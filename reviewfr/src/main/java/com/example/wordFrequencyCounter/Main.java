package com.example.wordFrequencyCounter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Map<String, Integer> counter = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String text = scan.nextLine();

        String[] words = text.toLowerCase().split(" ");

        for(String word: words){
            if(!word.isEmpty()){
                counter.put(word, counter.getOrDefault(word, 0) + 1); //getOrDefault used to retrieve a value associated with a key. If the key is present, its corresponding value is returned. If the key is not found, the method returns a specified default value instead of throwing an exception or returning null
            }
        }

        System.out.println("Word counts");
        for(Map.Entry<String, Integer> entry : counter.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
