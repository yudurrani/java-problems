package iti1121Exercise;

public class binaySearch {

	// array[] = 3,4,5,6,7,1,2
	// making a function to get the minmum value, that takes in a array

	public static int getMinByBinary(int[] array, int start, int end) {

		int arrayMid = (start + end) / 2;

		if (array == null)
			return 0;

		if (array.length < 1 || (end - start) < 1)
			return array[start];

		else if (array.length < 2 || (end - start) < 2) {
			if (array[0] < array[1] || array[start] < array[end])
				return array[start];
			else
				return array[end];
		}

		if (array[arrayMid] < array[end] && array[start] > array[arrayMid] )
			return array[arrayMid];
		
		
		if (array[arrayMid] < array[end] && array[start] < array[arrayMid] )
			return array[start];

		else if (array[arrayMid] > array[end]) {
				return getMinByBinary(array, arrayMid+1, end);

		}

		if (array[start] < array[arrayMid])
			return array[start];

		else {
			return getMinByBinary(array, start, arrayMid-1);

		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 6, 7, 1, 2, 3, 4 };

		System.out.println(getMinByBinary(arr, 0, (arr.length - 1)));
	}
}
