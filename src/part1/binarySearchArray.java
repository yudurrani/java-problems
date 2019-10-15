package part1;

public class binarySearchArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(searchArray(arr, 11, 0, arr.length));
	}

	public static boolean searchArray(int[] arr, int sNumber, int start, int end) {

		// base case

  		int mid = (start+end) / 2;
//		end = arr.length - 1;

		if ((end-start) == 1 & sNumber != arr[end-1])
			return false;

		else if (sNumber == arr[mid])
			return true;

		else if (sNumber < arr[mid]) {

			return searchArray(arr, sNumber, start, mid);

		}

		else {
			return searchArray(arr, sNumber, mid, end);

		}
	}
}

//
//	public static boolean searchArray(int[] arr, int x) {
//
//		int lowIndex = 0;
//		int midIndex = arr.length / 2;
//		int highIndex = arr.length-1;
//
//		if (arr.length == 1 & x != arr[highIndex]) {
//			return false;
//		}
//
//		if (x == arr[midIndex]) {
//			return true;
//
//		}
//
//		else if (x < arr[midIndex]) {
//
//			int[] newArray = subArray(arr, lowIndex, midIndex);
//
//			return searchArray(newArray, x);
//
//		}
//
//		else {
//			int[] newArray = subArray(arr, midIndex, highIndex+1);
//
//			return searchArray(newArray, x);
//		}
//
//	}
//
//	public static int[] subArray(int[] ar, int x, int y) {
//
//		int length = y - x;
//
//		int[] subArr = new int[length];
//
//		for (int i = 0; i < length; i++) {
//			subArr[i] = ar[x + i];
//		}
//
//		return subArr;
//	}

// }