package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCakeCandle {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int max=0;
        int total=0;
        for (int x=0; x<ar.length; x++){

            if (ar[x]>max){
            	max=ar[x];
            	
                
            }
            else;
        }
         for (int x=0; x<ar.length; x++) {
        	 if (ar[x] == max){
        		 total = total+1;
        		 
        	 }
            

        	 else;
        }
         return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        System.out.println(birthdayCakeCandles(ar));

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

        scanner.close();
    }
}
