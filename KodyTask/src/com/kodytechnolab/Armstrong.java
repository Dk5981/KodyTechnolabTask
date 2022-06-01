/*This Program finds whether entered number is armstrong or not.*/
package com.kodytechnolab;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Taking the Input from the user and stores it into number variable. */
		System.out.print("Enter the Number :: ");
		int number = sc.nextInt();

		/* Stores the value of number variable to temporary variable. */
		int temp = number;
		/* rem variable for stores the value of reminder of number variable. */
		int rem = 0;
		int armstrong = 0;

		/* count the digits of the number variable. */
		String count = String.valueOf(number);
		int length = Integer.valueOf(count.length());
		int fix = length;

		/* Iterate loop while number is greater than zero. */
		while (number > 0) {
			int f = 1;
			rem = number % 10;
			while (length > 0) {
				f = f * rem;
				length--;
			}
			armstrong = armstrong + f;
			number = number / 10;
			length = fix;
		}

		if (temp == armstrong) {
			System.out.print(temp + " is armstrong number");
		} else {
			System.out.println(temp + " is not armstrong number");
		}
		sc.close();
	}
}
