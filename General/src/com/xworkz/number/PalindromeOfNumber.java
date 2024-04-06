package com.xworkz.number;

public class PalindromeOfNumber {

    public static void palindromeCheck(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10;
        }

        System.out.println("Original number: " + number);
        System.out.println("Reverse number: " + reverseNumber);
        System.out.println();

        System.out.println((originalNumber == reverseNumber) ? "Palindrome." : "Not a palindrome.");
    }

    public static void main(String[] args) {

        palindromeCheck(438);
    }
}
