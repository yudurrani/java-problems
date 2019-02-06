package pairs;

import java.sql.Array;

public class PairArray implements Pair {

// store 2 numbers in Array and print them

	private int[] array;

	PairArray(int x, int y) {
		array = new int[2];
		array[0] = x;
		array[1] = y;

	}

	public int getFirst() {
		return array[0];
	}

	public int getSecond() {
		return array[1];
	}

	public void setFirst(int x) {
		array[0] = x;
	}

	public void setSecond(int y) {
		array[1] = y;
	}

}
