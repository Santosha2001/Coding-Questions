package com.santosh.general_questions;

import java.util.Scanner;

/*
 * FIBONASCI SERIES
 * 1. first number is 0 and second number is 1.
 * 2. sum of first and second number is result of next number.
 * 3. if second number is same as first, then second number is next number. 
 * */

public class FibonasciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:: ");

		int number = scanner.nextInt();
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber;

		scanner.close();

		for (int i = 0; i < number; i++) {
			System.out.print(firstNumber + ", ");
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}
}
