package com.xworkz;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = scanner.nextInt();
        int originalNumber = number;
        int reverseNumber = 0;

        scanner.close();

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reverse number: " + reverseNumber);

        System.out.println((originalNumber == reverseNumber) ? "Palindrome" : "Not palindrome");
    }
}
