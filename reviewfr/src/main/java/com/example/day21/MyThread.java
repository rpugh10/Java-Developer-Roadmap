package com.example.day21;

public class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
