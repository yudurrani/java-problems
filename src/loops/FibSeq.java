package loops;

import java.util.Scanner;

public class FibSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 1 2 3 5 8 13...
		
		// x4 = x4-2 + x4-3

//		System.out.print("The Fib system : Enter the number you want to get the value of;");
//
//		Scanner scan = new Scanner(System.in);
//		
//		int ScanNum = scan.nextInt();
//		
//		if ( x = 0 ; x ) {
//			
//			int x = 1 ;
//			
//			int y = 
//			
//			ScanNum = ScanNum - (ScanNum -1);
		
		
	
		
		
		int [] fib = new int[10] ;
		
		fib [0] = 1 ;
		fib[1] = 1 ;
	
		
		
		for (int num = 2 ; num < 10 ; num++) {
			
			fib [num] = fib [ num-2] + fib [num-1];
				
			System.out.println (fib[num]);	
		
		}

		
		///another way
		
		
		int fib1 = 1;
		int fib2 = 1;
		
		int nthNum =  10;
		
		for(int i =2; i < nthNum; i++) {
			int temp = fib2;
			
			fib2 = fib1 + fib2;
			fib1 = temp;
			System.out.println(fib2);

		}
		
		for(int i =1; i <= 10; i++) {
			System.out.println(fib(i));
		}
		
	}

	public static int fib(int n) {
		if(n <= 2) {
			return 1;
		}
		return fib(n-2)+fib(n-1);
	}
	
	
 ;}
