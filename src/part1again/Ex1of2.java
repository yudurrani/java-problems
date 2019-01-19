package part1again;

import java.text.DecimalFormat;

public class Ex1of2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * //Write a program that displays a Celsius 
 * to Fahrenheit conversion table given that C = (5/9)*(F-32)
 */
		
		System.out.println("F     |     C ");
		
		DecimalFormat formattor = new DecimalFormat("#.##");
		
	
		
		for ( int i=0; i <= 100; i++ ) {
			
			double c = toCel(i);
			
			System.out.println( i + "         " + formattor.format(c));
			
			
		}
		
	}
	
	public static double toCel(double fh) {
		
		return (5.0/9.0) * (fh-32.0);
	}
	

}
