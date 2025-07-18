package com.example.day10;

public class Div0 {

    public static int divide(int num1, int num2){
      try {
          return num1/num2;
      } catch (ArithmeticException e) {
        System.out.println("Cant divide by 0");
        return 0;
      }
    }

    public static void main(String[] args) {
        divide(5, 0);
    }
}
