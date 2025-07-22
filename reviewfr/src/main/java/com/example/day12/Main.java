package com.example.day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt", true))){
            System.out.println("How many student objects do you want to add: ");
            int input = scan.nextInt();
            scan.nextLine();

            for(int i = 0; i < input; i++)
            {
                System.out.println("Enter student name, id, and grade: ");
                String name = scan.nextLine();
                int id = scan.nextInt();
                scan.nextLine();
                int grade = scan.nextInt();
                scan.nextLine();
                Student student = new Student(name, id, grade);

                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            }
            System.out.println("Students sent to a file");

        }catch(IOException e)
        {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            List<Student> studentList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int id = Integer.parseInt(parts[1]);
                    int grade = Integer.parseInt(parts[2]);
                    studentList.add(new Student(name, id, grade));
                }
            }
            for(Student s: studentList){
                System.out.println("Name: " + s.getName() + "| ID: " + s.getId() + "| Grade: " + s.getGrade());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
