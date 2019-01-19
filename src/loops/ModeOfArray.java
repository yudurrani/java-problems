package loops;

public class ModeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4) Write a method named modeOf that takes in an integer array a1 and prints
		 * out the mode value(s) that of the numbers stored in the array. Recall that a
		 * set of numbers can have more than one mode
		 * 
		 * [2,3,6,9,4,6,4,6] A mode is number that occurs the highest number of time
		 */

		int[] avg = new int[6];
		avg[0] = 2;
		avg[1] = 1;
		avg[2] = 2;
		avg[3] = 2;
		avg[4] = 5;
		avg[5] = 6;

		for (int x = 0; x < avg.length; x++) {

			System.out.print(avg[x]);
			if (x < avg.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println("");
		
		int mode = 1 ;
		
		int maxcount = 1; 

		for (int j = 0; j < avg.length; j++) { // main loop to start the avg [j] integer

			int counts = 0; // to count the recurrence of the avg[j] integer

			for (int i = 0; i < avg.length; i++) { // second loop to compare avg [j] integers to avg [i]

				if (avg[j] == avg[i]) { // to get the true booleans loop

					counts++; // adding the true booleans
				}
			}
			
		
			

			System.out.println(avg[j] + " " + counts); // to print array integers and there number of occurrence
			
			
			
			if ( counts > maxcount) {
				
				maxcount = counts;
				
				mode = avg[j];
				
				
			}
			
			
			
		
			
			
			
		}
		
		
		
		System.out.println("The mode is " + mode + " with count " + maxcount);
		// what is the max count

	
	}


}
