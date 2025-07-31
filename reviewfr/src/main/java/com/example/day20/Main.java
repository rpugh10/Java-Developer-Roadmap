package com.example.day20;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Write report", Status.TODO));
        tasks.add(new Task("Fix Bug", Status.IN_PROGRESS));
        tasks.add(new Task("Review", Status.DONE));
        tasks.add(new Task("Make plans", Status.TODO));
        tasks.add(new Task("Camping", Status.DONE));

        System.out.println("Tasks that are still to do");
        for(Task task: tasks){
            if(task.getStatus() == Status.TODO){
                System.out.println(task);
            }
        }

    }
}
