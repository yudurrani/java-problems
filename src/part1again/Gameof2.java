package part1again;

import java.util.Scanner;

public class Gameof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Write a program that is a guessing game for the user. You will pick a number
		 * from one to ten and the user will continually guess what the number is until
		 * they get it right.
		 */

		Scanner scan = new Scanner(System.in);

		int num = 6;

		while (true) {

			System.out.println("Enter the number from 1 to 10 :");

			int guess = scan.nextInt();

			if (guess == num) {

				System.out.println("You have guessed the right number");

				break;
			}

		}
	}

}
