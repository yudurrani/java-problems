package part1again;

import java.util.Scanner;

public class NegativeSqrAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will let you enter any number and that will print its square root 
		 * or the message “negative numbers do not have square roots”.
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Write a number you want to take square root of :");
		
		double input = scan.nextDouble();
		
		if (input < 0.0) {
			
			System.out.println(" negative numbers do not have square roots");
		}
		
		else {
			double sqrt = Math.sqrt(input);
			System.out.println(" The square root is " + sqrt);
			
		}
			
			
		}
	}


