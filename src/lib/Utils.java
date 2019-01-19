package lib;

public class Utils {

	public static void print(int[] array) {
		for (int x = 0; x < array.length; x++) {

			System.out.print(array[x]);
			if (x < array.length - 1) {
				System.out.print(",");
			}
		}
	}
}
