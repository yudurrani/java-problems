package loops;

import java.util.Scanner;

public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a method fillArray that takes in an integer array named intArray and
		 * fills it with numbers entered from the user.
		 */

		Scanner scan = new Scanner(System.in); // scan a value

		System.out.println("How many Number do you want to enter ?"); // to print

		int totalN = scan.nextInt(); // how many numbers user want

		int[] intArray = new int[totalN];

		arrayNumbers(intArray);
		
		printArray(intArray);
		
	}

	/**
	 * creating a method
	 */

	public static void arrayNumbers(int[] intArray) {

		Scanner scan = new Scanner(System.in); // scan a value

		for (int a = 0; a < intArray.length; a++) {

			System.out.println("Enter the number " + (a + 1));

			intArray[a] = scan.nextInt();

		}
		

	}

	public static void printArray(int[] intArray) {
		
		System.out.println(" The array goes like :");

		for (int a = 0; a < intArray.length; a++) {

			System.out.println( intArray[a]);
		}
	}

}
