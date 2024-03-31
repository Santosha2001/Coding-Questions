package com.xworkz;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else System.out.println(number + " is odd.");
    }
}
