package part1;

public class Merge_Sort {

	
	public static void main(String[] args) {
		int[] arr = new int[] {2,1,5,7,4,8,12};
		mergeSort(arr, 0, arr.length);
		
		for(int val: arr) {
			System.out.println(val);
		}
	}
	public static int[] mergeSort(int[] arr, int start, int end) {

		// base case

		if ((end - start) <= 2) {

			int first = arr[start];
			if (arr[start] > arr[end - 1]) {
				arr[start] = arr[end - 1];
				arr[end - 1] = first;
			}

		} else {

			int mid = (start + end) / 2;

			mergeSort(arr, start, mid);
			mergeSort(arr, mid, end);

			int intArray[] = new int[end - start];
			int cursor1 = start;
			int cursor2 = mid;

			for (int i = 0; i < intArray.length; i++) {

				if (cursor1 >= mid || (cursor2 < end && arr[cursor1] > arr[cursor2])) {
					intArray[i] = arr[cursor2];
					cursor2++;
				} else {
					intArray[i] = arr[cursor1];
					cursor1++;
				}

			}

			for (int i = 0; i < intArray.length; i++) {
				arr[start + i] = intArray[i];
			}

		}

		return arr;

	}
}
