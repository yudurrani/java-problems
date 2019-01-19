package part2;

import java.util.Scanner;

public class PrintFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that prints out n! (factorial) for a user entered integer n
		 * (remember 1!=1, 2!=2*1, 3!=3*2*1, etc)
		 */

		System.out.println("Enter number you want to get factorial of?");// to print
		Scanner scan = new Scanner(System.in); // scan a value
		int n = scan.nextInt(); // asking for a number
		int t = 1;

		for (int i = n; i >= 1; i = i - 1) {

			t = t * i;

		}

		System.out.println("Sum = " + t);// to print

	}

}
