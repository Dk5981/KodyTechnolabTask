/*This Program print DiamondCharacter Pattern from A to F. */
package com.kodytechnolab;

/**
 * 
 * @author Lenovo
 *
 */
public class DiamondCharacterPattern {

	public static void main(String[] args) {

		/* Initialize ASCII variable to 65 to print character. */
		int ascii = 65;
		/* Initialize k variable to 2 to print character after 6th row. */
		int k = 2;

		/* outer for loop for iterate over rows. */
		for (int i = 0; i <= 10; i++) {
			int count = 0;
			/* inner for loop for iterate over columns. */
			for (int j = 0; j <= 10; j++) {
				if (i + j == 5 || j - i == 5) {
					System.out.print((char) (ascii + i));
				} else if (i >= 6 && i - j == 5 || i + j == 15) {
					count++;
					System.out.print((char) (ascii + i - k));

					if (count == 2) {
						k = k + 2;
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
