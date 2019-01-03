package part1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that lets you enter a number of minutes, and will calculate the number of days, hours, and minutes that that represents.
		
		System.out.println("Enter number of Minutes");// to print
		
		Scanner scan = new Scanner(System.in); // to read the system input
		
		int min = scan.nextInt(); // read Integer
		
		int days = min/1440;
		
		min = min % 1440; // working on remaining minutes from days
		//min = min - days*1440; // take out days we calculated

		int hours = min/60; // hours calculation
		
		min = min % 60; // Working on remaining minutes from hours
		//min = min % hours*60; // take out hours we calculated already

		
		
		System.out.println(" Days = " + days); // print
		System.out.println(" Hours = " + hours); // print
		System.out.println(" Minutes = " + min); // print
				
				
	}

}
