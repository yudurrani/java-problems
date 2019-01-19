package part2;

import java.util.Scanner;

public class AddingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that takes in the user’s 
		 * input and adds it up until the user enters in a value of 0
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		double x = 0.0 ;
		
		while (true){
			
			System.out.println("Enter your number :");
			
			double num = scan.nextDouble();
			
			x = x+num;
			
			
			if (num == 0) {
				
				System.out.println(x);
				
				break;
				
				
			}
			
		
			
		}
		
	}

}
