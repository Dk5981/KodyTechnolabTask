/*This Progrm prints prime numbers between 1 to 100.*/
package com.kodytechnolab;

public class PrimeNumber {

	public static void main(String[] args) {

		/* j variable which check that the number is divided from 2 to itself. */
		int j = 0;

		for (int i = 1; i <= 100; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			/* compare i and j variable if it is same number is prime and print it. */
			if (i == j) {
				System.out.print(i + " ");
			}
		}
	}

}
