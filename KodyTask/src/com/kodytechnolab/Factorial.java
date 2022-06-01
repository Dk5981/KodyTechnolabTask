/*This Program prints factorial of number entered by User.*/
package com.kodytechnolab;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		/* Initialize fact variable to 1 which stores factorial of number further. */
		int fact = 1;

		Scanner sc = new Scanner(System.in);

		/* Taking the input from the user and store it to the number vriable. */
		System.out.println("Enter the Number :: ");
		int number = sc.nextInt();

		/* Iterate for loop from 1 to number variable. */
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + number + " is :: " + fact);
		sc.close();
	}
}
