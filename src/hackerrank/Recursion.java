package hackerrank;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// make a program to calculate factorial
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter the number you want to take factorial of : ");
		
		int input = scan.nextInt();
		
		int x = factorial(input);
		
		System.out.println(x);
	}
	
	public static int factorial( int x) {
		
		if ( x==1) {
			return 1;
		}
		
		else 
			return x*factorial(x-1);
		
		
	}
	

}
