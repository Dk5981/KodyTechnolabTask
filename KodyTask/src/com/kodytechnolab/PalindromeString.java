package com.kodytechnolab;

/*This program checks whether entered string is palindrome or not. */
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Taking input from the user and store it to the line object. */
		System.out.println("Enter the String :: ");
		String line = sc.next();

		/* Convert string object to character array. */
		char ch[] = line.toCharArray();

		/* Stores the character in reverse order in character array. */
		for (int i = (line.length() - 1), j = 0; i >= 0; i--, j++) {
			ch[j] = line.charAt(i);
		}

		/* Convert character array into String Object. */
		String reverse = new String(ch);

		if (reverse.trim().equals(line)) {
			System.out.println(line + " is Palindrome.");
		} else {
			System.out.println(line + " is not Palindrome. ");
		}
		sc.close();
	}
}
