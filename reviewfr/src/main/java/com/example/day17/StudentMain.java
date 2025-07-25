package com.example.day17;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
public class StudentMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        List<Student> students = new ArrayList<>();

        System.out.println("How many students do you want to enter: ");
        int input = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < input; i++){
            System.out.println("Enter student name and grade: ");
            String name = scan.nextLine();
            int grade = scan.nextInt();
            scan.nextLine();

            Student student = new Student(name, grade);
            students.add(student);
        }

        OptionalDouble average = students.stream()
        .mapToInt(Student::getGrade)
        .average();

        if(average.isPresent()){
            System.out.println("Students average grade: " + average.getAsDouble());
        }

        long count = students.stream()
        .filter(student -> student.getGrade() > 75)
        .count();
        System.out.println("Students with grades over 75: " + count);

        List<String> passed = students.stream()
        .filter(student -> student.getGrade() >= 50)
        .map(Student::getName)
        .toList();

        System.out.println("Passed students " + passed);

        students.stream()
        .sorted((a, b) -> Integer.compare(a.getGrade(), b.getGrade()))
        .forEach(student -> System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade()));
    }
}
