package part1again;

import java.util.Scanner;

public class Ex4of1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that lets you enter a number of minutes, 
		 * and will calculate the 
		 * number of days, hours, and minutes that that represents.
		 */
		
		Scanner scan = new Scanner(System.in); // scan values in the system
		
		System.out.println("Enter your minutes : ");
		
		int min = scan.nextInt(); //  scanning mins
		
		int days = min / 1440 ; // how many days
		
		int remDays = min % 1440 ; // remaining days
		
		int hours = remDays / 60 ; // how many hours
		
		int remhours = remDays % 60 ; // remaining hours
		
		System.out.println("Day = " + days );
		System.out.println("Hours = " + hours );
		System.out.println("Mins = " + remhours );
	
		
		
		
		
		
	}

}
