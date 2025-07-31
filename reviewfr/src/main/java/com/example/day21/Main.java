package com.example.day21;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
        t1.join();
        t1.join();

        System.out.println("Main thread done");

    }
}
