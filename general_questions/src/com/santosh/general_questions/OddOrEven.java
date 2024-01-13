package com.santosh.general_questions;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to check:: ");

		int number = scanner.nextInt();

		scanner.close();

		if (number % 2 == 0) {
			System.out.println(number + " is Even.");
		} else {
			System.out.println(number + " is Odd.");
		}

		// Ternary operator
		System.out.println((number % 2 == 0) ? "Even" : "Odd");
	}
}
