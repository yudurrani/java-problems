package part2;

import java.util.Scanner;

public class MinFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How many number do you wish to add?");// to print
		Scanner scan = new Scanner(System.in); // scan a value
		int n = scan.nextInt(); //asking for a number 
		int t = Integer.MAX_VALUE;
		
		
		for(int i=1; i<=n; i=i+1) {
			System.out.println("Enter the number "+ i );// to print

			int b = scan.nextInt(); //asking for a number 
			t = Math.min(t,b); 
			
		
		}
		
		
	
		
		System.out.println("The lowest number = " + t );// to print

		
		

	}

}
