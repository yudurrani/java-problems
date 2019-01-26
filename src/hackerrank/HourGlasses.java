package hackerrank;

import java.util.Scanner;

public class HourGlasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[][] fullArray = new int[6][6];

		for (int x = 0; x < 6; x++) {

			String[] rowArray = scan.nextLine().split(" ");
			System.out.println("");

			for (int y = 0; y < 6; y++) {

				int arr = Integer.parseInt(rowArray[y]);
				fullArray[x][y] = arr;

			}

		}

		int sum = 0;
		int max = Integer.MIN_VALUE;

		for (int x = 0; x < 4; x++) {

			for (int y = 0; y < 4; y++) {

				sum = fullArray[x][y] + fullArray[x][y + 1] + fullArray[x][y + 2] + fullArray[x + 1][y + 1]
						+ fullArray[x + 2][y] + fullArray[x + 2][y + 1] + fullArray[x + 2][y + 2];

				if (sum > max)
					max = sum;

			}

		}
		
		System.out.println(max);

	}
}
