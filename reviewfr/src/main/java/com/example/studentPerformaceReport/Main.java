package com.example.studentPerformaceReport;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("How many students do you want to create: ");
        int input = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < input; i++){
            System.out.println("Enter student name, grade, and 1 subject they are taking: ");
            String name = scan.nextLine();
            int grade = scan.nextInt();
            scan.nextLine();
            String subject = scan.nextLine();

            Student student = new Student(name, subject, grade);
            students.add(student);
        }

        Map<String, List<Student>> grouped = students.stream()
        .collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(grouped);

        grouped.forEach((subject, list) -> {
            OptionalDouble avg = list.stream()
                .mapToInt(Student::getGrade)
                .average();
            System.out.println("Subject: " + subject + ", Average Grade: " + (avg.isPresent() ? avg.getAsDouble() : "N/A"));
        });

        students.stream()
        .max(Comparator.comparingInt(Student::getGrade))
        .ifPresent(student -> System.out.println("Student with highest grade: " + student));
    }
}
