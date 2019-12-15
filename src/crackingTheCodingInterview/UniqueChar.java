package crackingTheCodingInterview;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {

		// scan

		Scanner scan = new Scanner(System.in);
		String x = scan.next();

		// use chkUnique on scanned

		chkUnique(x);
		


		// print true or false

	}

	private static void chkUnique(String x) {
		// checking if an empty is passed
		
		if ( x.equals(null) || x.equals("")) {
			System.out.println("No String entered to check unique chars");
		}
		
		
		// checking if string is passed
		
		else if (!x.matches("^[a-zA-Z]*$")) {
			System.out.println("Please enter alphabets only");
		}
		
		
		else { 
			
			char[] cArray = x.toCharArray();
			int total = 0;
		
			for( int fl = 0; fl < cArray.length-1; fl++) {
				
				for ( int sl = 1 + fl; sl < cArray.length; sl ++) {
					
					if( cArray[fl] == cArray[sl]){
						total++;						
					}
					
				}			
			}
			
			System.out.println(total);
			if (total == 0){
				System.out.println("Unique String");
				
			}
			else System.out.println("String not Unique");
		}
		
	}

}
