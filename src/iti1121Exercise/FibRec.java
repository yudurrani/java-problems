package iti1121Exercise;

public class FibRec {

	
	public static void main(String[] args) {
		
		
		System.out.println(fibRecursive(7,7,0,1));
		}
	
//	public static int fibRec(int num) {
//		if(num == 1 || num == 2) {
//			return num -1;
//		}
//		
//		return fibRec(num-2)+fibRec(num-1);	
//	}
	
	public static int fibRecursive(int sNum, int number, int prev, int next) {
		
		if(number == 1 || number == 2) {		
			return (sNum-1);
		}
			
		
		else if(number == 3) {
			return (prev+next);
		}
		
		else if(number > 3) {
			sNum = prev+next;
			
			prev = next;
			next = sNum;
			number = number -1;
			
			return fibRecursive(sNum, number, prev, next);
		}

		
	
	return sNum;
	
	
}}
	
