package crackingTheCodingInterview;

public class PictureTilt {
	/*
	 * Given an image represented by an NxN matrix, where each pixel in the image is
	 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
	 * place?
	 */

	public static void main(String[] Args) {

		// given an image array with dimentions
		int n = 5;
		int count = 1;

		int[][] image = new int[n][n];

		for (int row = 0; row < n; row++) {

			for (int col = 0; col < n; col++) {

				image[row][col] = count;
				count++;
			}
		}

		for (int i = 0; i < image.length; i++) {
			for (int x = 0; x < image.length; x++) {
				System.out.print(" " + image[i][x] + " ");
			}
			System.out.println("");
		}

		int[][] testing = flip90Degree(image);
		System.out.println(" ------ ");

		for (int i = 0; i < image.length; i++) {
			for (int x = 0; x < image.length; x++) {
				System.out.print(" " + testing[i][x] + " ");
			}
			System.out.println("");
		}
	}

	public static int[][] flip90Degree(int[][] img) {
		
		// testing edge cases
		
		if(img == null) {
			return null;
		}
		
		if( img.length < 2) {
			return null;
		}
		
		
		// solving with algorithm

		int[][] newPosition = new int[img.length][img.length];

		for (int row = 0; row < img.length; row++) {

			for (int col = 0; col < img.length; col++) {

				newPosition[col][(img.length - 1) - row] = img[row][col];

			}
		}

		return newPosition;
	}

}
