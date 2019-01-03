package part2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatter = new DecimalFormat("#.##");
		
		double randomValue = Math.random() * 500.0 ;
		String formattedValue = formatter.format(randomValue);
		double cost = Double.parseDouble(formattedValue);
		
		System.out.println("Your Final Bill is   $" + cost);
		
		System.out.println("Please Enter your Full Payment Amount");
		
		Scanner scan = new Scanner(System.in); // scan a value
		
		double Payment = scan.nextDouble(); // read double number as the payment for the bill
		
		double Balance = Payment - cost;
		
		System.out.println("Your Balance is   $" + formatter.format(Balance));
		
		
		System.out.println("Your Change goes like ");
		
		
		int b100 = (int) Balance/100 ;
		Balance = Balance % 100;
		
		
		int b50 = (int) Balance /50;
		Balance = Balance % 50;

		
		int b20 = (int) Balance / 20;
		Balance = Balance % 20;
		
		int b10 = (int) Balance /10;
		Balance = Balance % 10;
		
		int b5 = (int) Balance /5;
		Balance = Balance % 5;
		
		int b1 = (int) Balance /1;
		Balance = Balance % 1.0;
		
		int bq = (int) (Balance / 0.25);
		Balance = Balance % 0.25;
		
		int bt = (int) (Balance /0.10);
		
		
		
		if(b100 > 0) {
			System.out.println("100 Bills = " + b100);
		}
		
		if(b50 > 0) {
			System.out.println("50 Bills =  " + b50);
			
		}
		
		if(b10 > 0) {
		
			System.out.println("10 Bills =  " + b10);
			
		}
		
		if(b5 > 0) {
		System.out.println("5 Bills =  " + b5);
		}
		
		if(b1 > 0) {
		System.out.println("1 Bills =  " + b1);
		}
		
		if(bq > 0) {
		System.out.println("25 Cents =  " + bq);
		}
		
		System.out.println("10 cents =  " + bt);
	}

}
