package com.xworkz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner
                = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int number = scanner.nextInt();
        boolean isPrime = true;
        scanner.close();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        System.out.println((isPrime) ? "Prime" : "Not Prime");

    }
}
