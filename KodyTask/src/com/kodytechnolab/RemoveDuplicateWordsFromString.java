/*This program removes duplicate words from strings entered by User. */
package com.kodytechnolab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		/* Taking input from the user and store it to number variable. */
		System.out.println("How many sentences do you want to Enter ::  ");
		int number = sc.nextInt();

		/* Declare String sentence array of size number. */
		String sentence[] = new String[number];

		/* Iterate over sentences and read the input from the User. */
		for (int i = 0; i < sentence.length; i++) {
			System.out.println("Enter Sentence : " + (i + 1));
			sentence[i] = bi.readLine();
		}

		/* Iterate over sentences array. */
		for (int k = 0; k < sentence.length; k++) {
			/* Split the string and stores it to the string split array. */
			String split[] = sentence[k].split(" ");

			/*
			 * Iterate over split array and put 'R' if there is duplicate words in split
			 * array.
			 */
			for (int i = 0; i < split.length; i++) {
				for (int j = i + 1; j < split.length; j++) {
					if (split[i].equalsIgnoreCase(split[j])) {
						split[j] = "R";
					}
				}
			}
			/* if split contains 'R' ignore it otherwise print it. */
			for (String s : split) {
				if (s.equalsIgnoreCase("R")) {
					continue;
				} else {
					System.out.print(s + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
