package part1again;

import java.util.Scanner;

public class MinfinderAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that takes a total number of inputs from user,
		 * then gives the minimum number out of them. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the total number of Entries you want to make");
		
		int total = scan.nextInt();
		
		int oldNum = Integer.MAX_VALUE;
		
		for( int x=1; x<=total ; x++) {
			
			System.out.println("Enter the " + x +  " number :");
			
			int num = scan.nextInt();
			
			
			oldNum = Math.min(num, oldNum );
			
			
			
		}
		
		
		System.out.println("The Minimum number :"  + oldNum);
	}

}
