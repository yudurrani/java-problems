package part1again;

import java.util.Scanner;

public class Ex1of1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that prompts the user to enter 2 integer values, 
		 * then prints their sum, difference, product, and modulus 
		 */
		Scanner scan = new Scanner(System.in); // System.in to read the file;
		
		System.out.println( "Enter first integer"); // entering first integer
		
		int x = scan.nextInt(); //  read interger
		
		System.out.println( "Enter Second integer");
		
		int y = scan.nextInt(); // read second integer
		
		int sum = x+y; // addition
		int diff = x-y; // difference
		int product = x*y; // product
		int modulus = x%y; // modulus
		
		System.out.println("Sum  =" + sum);
		System.out.println("Difference  =" + diff);
		System.out.println("Product  =" + product);
		System.out.println("Modulus  =" + modulus);
		
		
	}

}
