package part2;

import java.text.DecimalFormat;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program that displays a Celsius to Fahrenheit conversion table given that C = (5/9)*(F-32)
		System.out.println("F    |    C");
		DecimalFormat formatter = new DecimalFormat("#.##");

		
		for(int i = 0; i <= 100 ; i=i+1) {
			//loop start
			

			double c = toCelcius(i);
			
			System.out.println(i +" "+ formatter.format(c)) ;
			
					
			
			
			//loop end
		}
		
	}

	public static double toCelcius(double fh) {
		
		return (5.0/9.0) * (fh-32.0);
	}
}
