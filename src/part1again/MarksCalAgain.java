package part1again;

import java.util.Scanner;

public class MarksCalAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that lets the user enter a mark between 0 and 100 and that
		 * will test its value and print appropriately: “PASS” or “FAIL” passing marks ,
		 * keep on trying until student is pass
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Enter your marks :");
			
			double marks = scan.nextDouble();
			
				if (marks>0.0 && marks<51) {
					
					System.out.println("Fail");
			
			
			}
			
			else if (marks>50.0 && marks<101.0) {
				
				System.out.println("pass");
			
				break;
		}
		
		
		}}
}


