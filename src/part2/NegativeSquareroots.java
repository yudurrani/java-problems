package part2;

import java.util.Scanner;

public class NegativeSquareroots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will let you enter any number and that will print its square root 
		 * or the message “negative numbers do not have square roots”.
		 */
	
		Scanner scan = new Scanner(System.in); // scanning a value
		
		while (true) {
			System.out.println("Enter the number ");
			
			int x = scan.nextInt();
			
			if (x>=0 ) {
				System.out.println("The square root is " + Math.sqrt(x));
			}
			
			if (x<0) {
				System.out.println("Negative numbers dont have square roots");
				
				break;
			
		}
	
	
	
	
	}}
}



