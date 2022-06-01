/*This program finds whether the entered number is neon number or not. */
package com.kodytechnolab;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Taking input from the user and stores it to the number variable. */
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();

		/* square variable store the multiplication of number variable by itself. */
		int square = number * number;
		/* sum variable store the sum of digits of square variable. */
		int sum = 0;
		/* rem variable stores the reminder of a square variable. */
		int rem = 0;

		while (square != 0) {
			rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}

		if (sum == number) {
			System.out.println("It is a Neon Number.");
		} else {
			System.out.println("It is not Neon Number.");
		}
		sc.close();
	}
}
