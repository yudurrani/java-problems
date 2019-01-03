package part2;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that is a guessing game for the user. You will pick a number
		 * from one to ten and the user will continually guess what the number is until
		 * they get it right.
		 */

		/*
		 * Second method int n = 1;
		 */
		Scanner scan = new Scanner(System.in); // scanning a value

		while (true) {
			// goes here
			int n = 6; // the number in mind
			System.out.println("Guess the number from 1 to 10");
			int x = scan.nextInt();

			if (x == n) {

				System.out.println("Your guess is right its " + x);
				break;

			}

			else {

				System.out.println("Try again ");

			}
		}

	}

	// after break jumps outside of loop
}
