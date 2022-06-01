/*This Program perform calculator operations. */
package com.kodytechnolab;

import java.util.Scanner;

public class Calculater {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		/*Stores the operator symbol in op variable entered by User.*/
		String op = "";

		/*
		 * Taking the 2 Numbers from the user and stores it in no1 and no2 variables
		 * respectively.
		 */
		System.out.println("Enter the Value of Number 1 :: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the value of number 2 :: ");
		int no2 = sc.nextInt();

		System.out.println("1. + \n2. - \n3. * \n4. / \n5. Exit");

		do {
			System.out.println("Enter the oprator for operation :: ");
			op = sc.next();
			switch (op) {
			case "+":
				System.out.println("Addition of 2 Numbers ::" + (no1 + no2));
				break;
			case "-":
				System.out.println("Substraction of 2 Numbers :: " + (no1 - no2));
				break;
			case "*":
				System.out.println("Multiplication of two Numbers :: " + (no1 * no2));
				break;
			case "/":
				if (no2 == 0) {
					System.out.println("Number 2 should be greater than 0");
				} else {
					System.out.println("Divison of 2 Numbers :: " + (no1 / no2));
				}
				break;
			case "Exit":
				System.exit(0);
			default:
				System.out.println("Please Enter a valid operator.");
				break;
			}
		} while (true);
	}
}