package com.santosh.general_questions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to check prime:: ");

		int number = scanner.nextInt();
		boolean isPrime = false;
		scanner.close();

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = true;
			}
		}
		System.out.println((!isPrime) ? "Prime number." : "Non prime.");
	}
}
