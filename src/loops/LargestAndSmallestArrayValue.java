package loops;

public class LargestAndSmallestArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5) Write a method named largestAndSmallest that takes in an integer array and
		 * prints out the largest and smallest integer values in the array.
		 */

		int[] avg = new int[6];
		avg[0] = 2;
		avg[1] = 1;
		avg[2] = 2;
		avg[3] = 2;
		avg[4] = 5;
		avg[5] = 6;

		largestAndSmallest(avg);

	}

	public static void largestAndSmallest(int[] ls) {

		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;

//		for (int x = 0; x < ls.length; x++) { // main loop to start the avg [j] integer
//
//			max =Math.max(max, ls[x]);
//			
//			min =Math.min(min, ls[x]);
//			
//			
//
//	}

		for (int num : ls) { // main loop to start the avg [j] integer

			max = Math.max(max, num);

			min = Math.min(min, num);

		}

		System.out.println("The Max, Min value in the the array : " + max + ", " + min);
	}
}
