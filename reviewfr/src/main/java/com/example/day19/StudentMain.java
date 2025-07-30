package com.example.day19;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        Set<String> names = new HashSet<>();
        Map<String, List<Student>> grouping = new HashMap<>();

        System.out.println("Enter how many students you want to enter: ");
        int input = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < input; i++){
            System.out.println("Enter student name, one subject, and grade: ");
            String name = scan.nextLine();
            String subject = scan.nextLine();
            int grade = scan.nextInt();
            scan.nextLine();

            Student student = new Student(name, subject, grade);
            students.add(student);
            names.add(name);
        }

        OptionalDouble average = students.stream()
        .mapToInt(Student::getGrade)
        .average();

        if(average.isPresent()){
            System.out.println("Average grade of students " + average.getAsDouble());
        }

        List<String> passed = students.stream()
        .filter(s -> s.getGrade() >= 50)
        .map(Student::getName)
        .toList();

        System.out.println("Students who passed: " + passed);

        Optional<Student> maxNum = students.stream()
        .max(Comparator.comparingInt(Student::getGrade));

        maxNum.ifPresent(s -> System.out.println("Top student: " + s.getName() + " - Grade: " + s.getGrade()));

        Optional<Student> minNum = students.stream()
        .min(Comparator.comparingInt(Student::getGrade));

        minNum.ifPresent(s -> System.out.println("Worst student: " + s.getName() + " - Grade: " + s.getGrade()));

        System.out.println("Printing students in descending order");

        students.stream()
        .sorted(Comparator.comparingInt(Student::getGrade).reversed())
        .forEach(student -> System.out.println("Name: " + student.getName() + "- Grade: " + student.getGrade()));
        
    }
}
