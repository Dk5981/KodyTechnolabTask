/* This program prints finds whether entered number is keith number or not.*/
package com.kodytechnolab;

import java.util.Scanner;

public class KeithNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Taking the input from the user and stores it to the number variable. */
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();

		/*
		 * Counts the digits of a number variable and stores it to the count variable.
		 */
		String length = String.valueOf(number);

		int count = Integer.valueOf(length.length());

		/* Initilize rem variable to 0 which stores the reminder of number variable. */
		int rem = 0;

		/* Declare array of size count variable. */
		int arr[] = new int[count];
		/* Store number variable into temporary variable. */
		int temp = number;
		/*
		 * Initialize sum variable to 0 which store the sum of array elements.
		 */
		int sum = 0;

		/* Stores array elements from number variable. */
		for (int i = count - 1; i >= 0; i--) {
			rem = number % 10;
			arr[i] = rem;
			number = number / 10;
		}

		while (sum < temp) {
			sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			/* Update array elements. */
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}

			arr[arr.length - 1] = sum;
		}

		if (sum == temp) {
			System.out.println(temp + " is a Keith Number");
		} else {
			System.out.println(temp + " is Not a Keith Number");
		}
		sc.close();
	}
}