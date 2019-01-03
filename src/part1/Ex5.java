package part1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that prompts a user to enter 2 side lengths 
		 * of a right angled triangle and outputs the length of the hypotenuse.
		 *  (Use the java Math functions Math.sqrt and Math.pow)
		 */
		
		/* anything in */
		
		System.out.println("Enter first side");// to print
		
		Scanner scan = new Scanner(System.in); // to read system input
		
		double x = scan.nextDouble(); //read first side
		
		System.out.println("Enter second side");// to print
		
		double y = scan.nextDouble(); //read second side
		
		double hyp = (Math.pow(x,2)) + (Math.pow(y,2));
		
		
		System.out.println("Length of Hypotenuse = " + Math.sqrt(hyp));
	
		
	}

}
