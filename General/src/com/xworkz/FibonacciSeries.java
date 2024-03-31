package com.xworkz;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;

        //number of fibonacci series
        int number = 8;

        for (int i = 0; i < number; i++) {
            System.out.print(firstNumber + ", ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
