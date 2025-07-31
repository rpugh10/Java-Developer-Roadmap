package com.example.day21;

public class MyRunnable implements Runnable{

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
