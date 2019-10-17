package iti1121Exercise;

public class DivideConquerMinMax {

	static class LowHighValues {
		int min =0;
		int max =0;
		

		LowHighValues(int min, int max) {
			// complete this
			this.min = min;
			this.max = max;
		}
		public String toString() {
			return "Min: "+min+", Max: "+max;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 5, 7, 4, 12, 14};
		System.out.println(minMax(arr, 1, arr.length));

	}

	public static LowHighValues minMax(int[] arr, int start, int end) {

		if(arr == null || arr.length == 0) {
			return null;
		}
		
		
		if ((end -start) == 0) {
			int min = arr[start];
			int max = arr[start];
			return new LowHighValues(min, max);
		}

		else if ((end-start) == 1) {
			if (arr[start] > arr[end-1]) {
				int min = arr[end-1];
				int max = arr[start];
				return new LowHighValues(min, max);
			} else {
				int min = arr[start];
				int max = arr[end-1];
				return new LowHighValues(min, max);

			}
		}

		else {
			int mid = (start + end) / 2;

			LowHighValues first = minMax(arr, start, mid);

			LowHighValues second = minMax(arr, mid, end);

			int lower;
			int higher;

			if (first.min < second.min) {
				lower = first.min;
			} else
				lower = second.min;

			if (first.max > second.max) {
				higher = first.max;
			} else
				higher = second.max;

			return new LowHighValues(lower, higher);

		}

	}
}
