package part1again;

import java.util.Scanner;

public class Ex3of1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * //Write a program that prompts the user to enter a temperature
		 *  in degrees Fahrenheit, and outputs the 
		 * equivalent degree measure in Celsius given that C = (5/9)*(F-32)
		 */
		
		
		
		
		System.out.println(" Please enter the temperature in Fahrenheit");
		
		Scanner scan = new Scanner(System.in); // scan a value
		
		double fah = scan.nextDouble(); // scanning a value
		
		double cel= (5.0/9.0)*(fah-32.0); // calculation
		
		System.out.println(" Celsius = " + cel);
		
		
		
		
		
	}

}
