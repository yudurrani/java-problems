package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class MinMaxOfArray {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {

		  	long[] newarr= new long[arr.length];
		  	
		  	for (int x=0; x<arr.length; x++) {
		  		newarr[x] = arr[x];
		  	}
	       

	        long min = Integer.MAX_VALUE;;
	        long max = Integer.MIN_VALUE;;
	        long result = 0;

		for (int x = 0; x < arr.length; x++) {

			int sum = 0;

			for (int total = 0; total < arr.length; total++) {

				sum = arr[total] + sum;

			}

			result = sum - arr[x];

			if (result > max) {
				max = result;

			}

			else if (result < min) {

				min = result;

			}
		}
		
		System.out.println(min +" "+ max);
	}

	

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}
