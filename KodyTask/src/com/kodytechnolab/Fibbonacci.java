/*This Program print the fibbonacci sereis from 1 to 100. */
package com.kodytechnolab;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {

		/* intialize a and b variable to 0 and 1 respectively and print it on screen. */
		int a = 0;
		int b = 1;
		/* initialize add variable to zero that stores the value of a and b variable. */
		int add = 0;

		Scanner sc = new Scanner(System.in);

		/* Taking the input from the user and store it to the number variable. */
		System.out.println("Enter the Number :: ");
		int number = sc.nextInt();

		System.out.print(a + " " + b + " ");

		for (int i = 2; i < number; i++) {
			add = a + b;

			if (add > 100) {
				break;
			}
			System.out.print(add + " ");

			/* Update the value of a and b after print the add variable. */
			a = b;
			b = add;
		}
		sc.close();
	}

}
