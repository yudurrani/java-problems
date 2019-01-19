package part1again;

import java.util.Scanner;

public class PrimeAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program called PrimeNumber which checks to see whether or not a user
		 * input number is prime. A prime number is one such that its only factors are 1
		 * and itself.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int input = scan.nextInt();
		
		boolean x = PrimeNumber(input);
		
		
		System.out.println(" Is the number is prime number = " + x);
		
		
	}

	public static boolean PrimeNumber(int primeChk) {
		
		
		
		for ( int x = 2 ; x < primeChk/2 ; x++) {
			
			if (primeChk % x == 0) 
			return false;
			
			
		}
		
		return true;
	}}

