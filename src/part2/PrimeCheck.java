package part2;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program called PrimeNumber which checks to see whether or not a user
		 * input number is prime. A prime number is one such that its only factors are 1
		 * and itself.
		 */

		Scanner scan = new Scanner(System.in); // scanning command

		System.out.println("Enter your number ");

		int num = scan.nextInt(); // number

		System.out.println("Is your number a Prime Number " + isPrime(num));

	}

	public static boolean isPrime(int number) {

		for (int x = 2; x < number/2; x = x + 1) {
			if (number % x == 0)
				return false;
				
		}

		return true;

	}

}
