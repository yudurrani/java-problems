package loops;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declare a String array of size 10. Fill the array with 10 names manually.
		 * Then write a for loop that iterates (goes through)the array and prints out
		 * all the names that are stored in the list.
		 */

		Scanner scan = new Scanner(System.in); // scan a value

		String[] arrayNames = new String[10];

		for (int i = 0; i <= 9; i++) {

			System.out.println("Enter the Name"); // adding marks

			String userInputs = scan.nextLine();

			arrayNames[i] = userInputs;

		}

		for (int i = 0; i < arrayNames.length; i++) {

			System.out.println(arrayNames[i]);// to print

		}
	}

}
