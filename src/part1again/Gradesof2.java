package part1again;

import java.util.Scanner;

public class Gradesof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
* Write a program that lets the user enter 5 marks and in each case prints out
 * the letter grade: (F=0-49, D=50-59, C=60-69, B=70-79, A=80-100). Also print
 * out the average of the 5 marks entered and assign it a letter as well.
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the total numbers you want to enter :");
		
		int totalNum = scan.nextInt();
		
		double avg = 0;
		
		for ( int x = 1 ; x <= totalNum ; x++) {
			
			System.out.println("Enter the " + x + " number");
			
			double num = scan.nextDouble();
			
			
			String grades= grade(num);
			
			
			System.out.println( grades );
			
			
			avg += num ;
			
			
		}
		
		
		avg = avg / totalNum;
		
		String Average = grade (avg);
		
		System.out.println( "total marks avg " + avg + " and " + Average );
		
		
		
	}

	public static String grade(double gra) {
		
		if (gra<=49) {
			return "You have F grade";
		}
		
		if (gra>49 && gra<=59) {
			return "You have D grade";
			
		}
		
		
		return "N/A";
		
		}
	}
	 

