/*This program checks whether the entered number is spy number or not. */
package com.kodytechnolab;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Taking the input from user and store it into number variable. */
		System.out.println("Enter the Number :: ");
		int number = sc.nextInt();
		/* store number variable value to the temporary variable. */
		int temp = number;

		/* Stores reminder of number variable to the rem variable. */
		int rem = 0;
		/* Stores sum of digits of number variable. */
		int sum = 0;
		/* stores multiplication of digits of number variable. */
		int product = 1;

		while (number > 0) {
			rem = number % 10;
			sum = sum + rem;
			product = product * rem;
			number = number / 10;
		}

		/* Compares sum and product variables. */
		if (sum == product) {
			System.out.println(temp + " is a Spy Number.");
		} else {
			System.out.println(temp + " is not a Spy Number.");
		}
		sc.close();
	}
}
