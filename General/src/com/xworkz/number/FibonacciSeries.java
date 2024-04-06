package com.xworkz.number;

public class FibonacciSeries {

    public static void fibonacciSeries(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;
        System.out.println("Fibonacci Series:");

        for (int i = 0; i < number; i++) {
            System.out.print(firstNumber + ", ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    public static void main(String[] args) {

        fibonacciSeries(8);

    }
}

