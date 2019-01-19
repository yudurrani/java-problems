package part1again;

import java.util.Scanner;

public class addingNumberof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the number you want to add");
		
		int sum = 0;
		
		while (true) {
			
			int Num = scan.nextInt();
			
			sum += Num ;
			
			
		
		if (Num == 0) {
			
			System.out.println("The sum = " + sum );
			
			break;
		}
			
		System.out.println("Enter another number or enter 0 to know the sum :");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
