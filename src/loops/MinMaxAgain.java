package loops;

import java.util.Scanner;

public class MinMaxAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// give user input for an array and determine the max and min number

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter the size of the array :");

		int size = scan.nextInt();

		int[] minmax = new int[size];

		int num;

		for (int x = 0; x < size; x++) {

			System.out.println("Enter your number");

			num = scan.nextInt();

			minmax[x] = num;

		}

		System.out.println(maxx(minmax));
		System.out.println(bestPlayer(minmax));

	}

	public static int maxx(int[] mx) {
		int max = Integer.MIN_VALUE;

		for (int x = 0; x < mx.length; x++) {

			max = Math.max(max, mx[x]);

		}
		return max;

	}
	
	
	public static int bestPlayer(int[] mx) {

		// int max = Integer.MIN_VALUE;
		
		int total = 0 ;

		for (int x = 0; x < mx.length; x++) {

			total = mx[x] + total;

		}
		return total;
	}
}
