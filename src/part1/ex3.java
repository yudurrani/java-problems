package part1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that prompts the user to enter a temperature in degrees Fahrenheit, and outputs the equivalent degree measure in Celsius given that C = (5/9)*(F-32)
		/**
		 * 
		 * sdfa
		 * 
		 * asdf
		 * 
		 */
		System.out.println("Enter the temperature in Fahrenheit!");// to print
		
		Scanner scan = new Scanner(System.in); // scan a value
		
		double dX = scan.nextDouble(); // read double
		
		double C = (5.0/9.0) * (dX-32.0);
		
		System.out.println( "Temperature in \"celsius\" = " + C );
				
				
		
	}

}
