package hackerrank;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// enter a decimal number to be converted to a Binary number
		// (15)10 = 15 / 2 - 7 and %1 + 7 /2 - 3 and %1 + 3/ 2 - 1 and %1 + 1/2 - 0 and
		// %1 = (1111)2

		System.out.println(" Enter your Decimal Number to be converted into Binary ");

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		char[] Binary = Integer.toBinaryString(input).toCharArray();

		System.out.println(Binary);

		int currentCount = 0;
		int max1s = 0;

		for (int i = 0; i < Binary.length; i++) {

			if (Binary[i] == '1') {
				currentCount = currentCount + 1;
			} else
				currentCount = 0;

			if (currentCount > max1s) {
				max1s = currentCount;
			}
		}

		System.out.println(max1s);

	}

}
