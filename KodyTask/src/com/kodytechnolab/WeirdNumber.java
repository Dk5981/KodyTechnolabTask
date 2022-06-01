/*This program checks whether entered number is weird number or not.*/
package com.kodytechnolab;

import java.util.Scanner;

public class WeirdNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Taking input from the user and stores it to the number variable. */
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();

		if (number % 2 != 0) {
			System.out.println("Weird");
		} else {
			if (((number >= 2 && number <= 5) || (number > 20))) {
				System.out.println("Not Weird");
			} else if (number >= 6 && number <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		}
		sc.close();
	}
}
