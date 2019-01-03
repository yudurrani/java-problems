package part1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program that prompts the user to enter 2 integer values, then prints their sum, difference, product, and modulus
		
		System.out.println("Enter first number!");// to print
		
		Scanner scan = new Scanner(System.in);// System.in to read from system input, scanner to read system input
		
		int x = scan.nextInt();// read integer
		
		System.out.println("Enter second number!");// to print
		
		int y = scan.nextInt();// read integer
		
		int sum = x+y;
		
		int difference = x-y;
		
		int pro = x*y;
		
		int modulus = x%y;
		
		double dX = (double)x;
		double division = dX/((double)y);
		
		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + difference);
		System.out.println("Product = " + pro);
		System.out.println("Modulus = " + modulus);
		System.out.println("Division = " + division);
		
		
	}

}
