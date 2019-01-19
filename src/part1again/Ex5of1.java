package part1again;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5of1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that prompts a user to enter 2 side lengths 
		 * of a right angled triangle and outputs the length of the hypotenuse.
		 *  (Use the java Math functions Math.sqrt and Math.pow)
		 */
		
		
		Scanner scan= new Scanner(System.in);
		
		DecimalFormat formatter = new DecimalFormat("#.##") ;
		
		System.out.println(" Enter the first side :");
		
		double firstSide = scan.nextDouble(); // scanner double for first side
		
		System.out.println(" Enter the second side :");
		
		double secondSide = scan.nextDouble(); // scanner double for second side
		
		double hypsqrt = (Math.pow(firstSide,2)) + (Math.pow(secondSide, 2)); // calculation
		
		double hyp = Math.sqrt(hypsqrt);
		
		
		System.out.println(" the Hyp is = " + formatter.format(hyp));
		
		
		
		
		
	}

}
