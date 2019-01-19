package part1again;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegisterof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formattor= new DecimalFormat("#.##");
		
		Double Random = Math.random() * 999;
		
		String Bill = formattor.format(Random);
		
		Double Bills = Double.parseDouble(Bill) ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Your Final Bill is  " + Bills );
		
		System.out.println(" How much did the customer paid : ");
		
		int TotalPaid = scan.nextInt(); // actual payment by the customer
		
		double Remaining = TotalPaid - Bills; 
		
		System.out.println(" Your balance is  " + Remaining);
		
		System.out.println(" Your change should go like :");
		
		int OneH = (int)Remaining / 100 ;
		
		int Remain = (int)Remaining % 100 ;
		
		int Fifty = Remain / 50 ;
		
		int Remain2 = Remain % 50 ;
		
		int Tens = Remain2/ 10 ;
		
		int Remain3 = Remain2 % 10 ;
		
		int tenCents = (int) (Remain3 / 0.10) ;
		
		System.out.println( "Your Change shall be like :" );
		
		System.out.println( "100 = " + OneH );
		System.out.println( " 50 = " + Fifty );
		System.out.println( " 10 = " + Tens );
		System.out.println( " 10 Cents = " + tenCents );
		
		
		
		
		
		
		
		
	}

	private static int Double(String bill) {
		// TODO Auto-generated method stub
		return 0;
	}

}
