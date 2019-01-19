package part1again;

import lib.Utils;

public class ArrayReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * to reverse the array locations
		 */

		int[] array = new int[6];
		array[0] = 2;
		array[1] = 1;
		array[2] = 3;
		array[3] = -1;
		array[4] = 5;
		array[5] = 6;

		int temp; // introducing new variable

		for (int y = 0; y < array.length; y++) {

			for (int x = y; x < array.length; x++) {

				if (array[y] > array[x]) {
					temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}

			}

		}
		Utils.print(array);
	}
}
