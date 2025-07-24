package com.example.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while(run){
            System.out.println("1. Load students from a file");
            System.out.println("2. Add student");
            System.out.println("3. View all students");
            System.out.println("4. Remove student by ID");
            System.out.println("5. Exit");
            int input = scan.nextInt();
            scan.nextLine();

            switch(input){
                case 1:{
                    try(BufferedReader bufferedReader = new BufferedReader(new FileReader("student.txt"))){
                        String line;
                        while((line = bufferedReader.readLine()) != null){
                            String[] parts = line.split(",");
                            if(parts.length == 3){
                                String name = parts[0];
                                int id = Integer.parseInt(parts[1]);
                                int grade = Integer.parseInt(parts[2]);
                                students.add(new Student(name, id, grade));
                            }
                        }

                        System.out.println("Students loaded into a List");
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    break;
                }
                case 2:{
                    try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt", true))){
                        System.out.println("Enter student name, id and grade ");
                        String name = scan.nextLine();
                        int id = scan.nextInt();
                        scan.nextLine();
                        int grade = scan.nextInt();
                        scan.nextLine();

                        Student student = new Student(name, id, grade);
                        bufferedWriter.write(student.toString());
                        bufferedWriter.newLine();

                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    break;
                }
                case 3:{
                    for(Student s: students)
                    {
                        System.out.println("Name " + s.getName() + ", ID " + s.getId() + ", grade " + s.getGrade());
                    }
                    break;
                }
                case 4:{
                    System.out.println("Enter student id to remove student");
                    int id = scan.nextInt();
                    scan.nextLine();

                    boolean removed = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId() == id) {
                            students.remove(i);
                            removed = true;
                            System.out.println("Student removed.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Student with ID " + id + " not found.");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Exiting");
                    run = false;
                }
                
            }
        }
        scan.close();

        
    }
}
