package com.example.day22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool{

    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 10; i++){
            final int task = i;
            service.execute(() ->{
                System.out.println("Task number " + task + " on thread " + Thread.currentThread().getName());
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            });
        }

        service.shutdown();
    }
}
