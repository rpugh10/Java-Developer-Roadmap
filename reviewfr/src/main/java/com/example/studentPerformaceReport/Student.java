package com.example.studentPerformaceReport;

public class Student {
    private String name;
    private String subject;
    private int grade;
    
    public Student(String name, String subject, int grade) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", subject=" + subject + ", grade=" + grade + "]";
    }

}
