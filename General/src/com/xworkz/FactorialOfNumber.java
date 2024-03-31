package com.xworkz;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int factorial = 1;
        int number = 4;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
