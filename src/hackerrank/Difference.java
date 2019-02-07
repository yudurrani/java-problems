package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] elements) {

		this.elements = elements;
	}

	void computeDifference() {

		for (int x = 0; x < elements.length; x++) {

			for (int i = 0; i < elements.length; i++) {

				int y = elements[x] - elements[i];

				if (y > maximumDifference) {

					maximumDifference = y;
				}
			}

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
} // End of Difference class

