package part2;

import java.util.Scanner;

public class MarksCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that lets the user enter a mark between 0 and 100 and that
		 * will test its value and print appropriately: “PASS” or “FAIL” passing marks ,
		 * keep on trying until student is pass
		 */

		Scanner scan = new Scanner(System.in); // scanning a value

		while (true) {

			System.out.println("Enter your marks");

			String input = scan.next();
			if (input.equalsIgnoreCase( "exit")){
				
				break;
			}
					
			 
			
			int marks = Integer.parseInt(input);
			
			System.out.println("You "+ getResult(marks)  +" with " + marks + " marks");

		}

	}
	
	public static int getSum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static String getResult(int marks) {
		if (marks > 50) {
			return "passed";
			
		} else {
			return "failed";

		}
	}

}
