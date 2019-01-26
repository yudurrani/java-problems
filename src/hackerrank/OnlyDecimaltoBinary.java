package hackerrank;

import java.util.Scanner;

public class OnlyDecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to convert a decimal to the binary
		//// (13)10 = 13 / 2 - 6 and %1 + 6 /2 - 3 and %0 + 3/ 2 - 1 and %1 + 1/2 - 0 and %1 
		// = (1101)2
		
		
		System.out.println("Enter the number you want to be converted to Binary");
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
//		scan/2 && scan%2
//		(scan/2)/2 && (scan/2)%2
		
		System.out.println(toBinary(input));
			
			
	}	
		
	public static String toBinary( int x) {
		
		String  Binary = "";
		
		while (true) {
			
			if ( (x/2) == 0) { 
				Binary=  "1" + Binary;
				break;
			}
			
			else {
				
				Binary = (x % 2) + Binary ;
				
				x = x/2;
				
				
			}
			
		}
		
		return Binary;
		
	}
}
