package iti1121Exercise;

public class FibItr {

	public static void main(String[] args) {
		
		
		System.out.println(fibItr(7));
		}
	
	
	public static int fibItr(int sNum) {
		
		if(sNum == 1 || sNum == 2) {		
			return (sNum-1);
		}
		
		int pre = 0;
		int next = 1;
		int sum = pre+next;
		
		for (int i=3 ; i<=sNum; i++) {
			sum = pre+next;
			pre = next;
			next = sum;
			
		}
		return sum;
	
	
	}

}
