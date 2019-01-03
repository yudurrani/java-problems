package part2;

import java.util.Scanner;

public class AddingNumbersUntil0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // scanning a value

		int totalSum = 0; // the addition

		while (true) {

			System.out.println("Enter the number you want to add");

			int x = scan.nextInt();

			totalSum += x;

			if (x == 0) {
				System.out.println("Your sum is " + totalSum);
				break;

			}
			System.out.println("Add another number ");
		}
	}
}
