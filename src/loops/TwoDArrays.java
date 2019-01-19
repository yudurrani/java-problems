package loops;

import lib.Utils;

public class TwoDArrays {

	public static void main(String[] args) {

		int[][] x = new int[4][3];

		x[0][0] = 50;

		x[0][1] = 40;

		x[0][2] = 60;

		// zaid safarshi marks

		x[1][0] = 90;

		x[1][1] = 90;

		x[1][2] = 90;

		// safia again

		x[2][0] = 50;

		x[2][1] = 40;

		x[2][2] = 60;

		// yasir marks

		x[3][0] = 50;

		x[3][1] = 40;

		x[3][2] = 60;

		String[] names = new String[4];

		names[0] = "safia";
		names[1] = "zaid";
		names[2] = "hafsa";
		names[3] = "yasir";

//		
//		for (int secondD  = 0 ; secondD < x.length ; secondD++){

//		for (int namePrint = 0; namePrint < names.length; namePrint++) {
//
//			System.out.print(names[1] + ": ");
//			Utils.print(x[1]);
//			System.out.println("");
//
//		}

		for (int rowNum = 0; rowNum < names.length; rowNum++) {

			System.out.print(names[rowNum] + ": ");

			for (int colNum = 0; colNum < x[0].length; colNum++)

				System.out.print(x[rowNum][colNum] + " ");


			System.out.println("");
		}

	}
}
