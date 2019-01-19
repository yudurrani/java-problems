package loops;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a method named averageOf that takes in an integer array a1 and returns a 
		 * double value that is the average of the numbers stored in the array.
		 */
		
		int[] avg = new int[6];
		avg[0] = 1;
		avg[1] = 2;
		avg[2] = 2;
		avg[3] = 2;
		avg[4] = 5;
		avg[5] = 6;
		
		double ans = averageOf(avg);
		
		System.out.println(ans);
	
	}
	

	
	public static double averageOf(int[] a1) {
		
		int sum = 0 ;
		
		for ( int  i= 0; i<a1.length ; i++) {
			
			sum += a1[i] ;
			
			
			
		}
		

		 
		double avg = sum / (double)a1.length;
		
		return avg;
	}
}
