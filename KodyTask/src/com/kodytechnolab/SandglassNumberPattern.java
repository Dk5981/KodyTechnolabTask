/*This program print Sandglass Number Pattern from 1 to 7. */

package com.kodytechnolab;

public class SandglassNumberPattern {

	public static void main(String[] args) {

		/* outer for loop for Iterate over rows. */
		for (int i = 1; i <= 7; i++) {
			/* for printing space. */
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			/* for printing values. */
			for (int k = i; k <= 7; k++) {
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}

		for (int i = 6; i >= 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int k = i; k <= 7; k++) {
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}
	}
}
