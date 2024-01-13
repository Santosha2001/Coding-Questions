package com.santosh.general_questions;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");

		int number = scanner.nextInt();
		int factorial = 1;

		scanner.close();

		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + number + " :: " + factorial);

	}
}
