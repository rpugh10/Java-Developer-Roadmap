package com.example.day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many student objects do you want to create: ");
        int input = scan.nextInt();
        scan.nextLine();

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt", true))){
            for(int i = 0; i < input; i++)
            {
                System.out.println("Enter student name: ");
                String name = scan.nextLine();
                System.out.println("Enter student id");
                int id = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter student grade");
                int grade = scan.nextInt();
                scan.nextLine();
                Student student = new Student(name, id, grade);

                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            } 
            System.out.println("Student(s) written to file");

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        }
        
    
    }
