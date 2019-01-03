package part2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that takes a number n, and takes n numbers from the user and gives the sum
		 * of the n numbers
		 * 
		 * So if user enters 3 for first number, then you ask user to enter 3 numbers, and give sum of the
		 * 3 numbers
		 */
		
		System.out.println("How many number do you wish to add?");// to print
		Scanner scan = new Scanner(System.in); // scan a value
		int n = scan.nextInt(); //asking for a number 
		int t = 0;
		
		
		for(int i=1; i<=n; i=i+1) {
			System.out.println("Enter the number "+ i );// to print

			int b = scan.nextInt(); //asking for a number 
			t = t+b; 
			
		
		}
		
		
	
		
		System.out.println("Sum = " + t );// to print


	}

}
