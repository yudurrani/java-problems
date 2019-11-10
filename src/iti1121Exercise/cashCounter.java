package iti1121Exercise;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	public static long kNs(long[][] twoD, int n, int k) {

		if ((n > 0 && k == 0) || n == k) {
			return 1l;
		}

		else {
			if (twoD[n][k] == 0) {
				twoD[n][k] = kNs(twoD, n - 1, k - 1) + (kNs(twoD, n - 1, k));
			}
			return twoD[n][k];

		}
	}
	/*
	 * Complete the 'getWays' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. INTEGER n 2. LONG_INTEGER_ARRAY c
	 */

	 public static long getWays(int money, List<Long> coins) {
	        return getComb(money, coins, coins.size()-1, new HashMap<Long, Long>());
	    }
	 public static long getComb(long money, List<Long> coins, int currentIndex, Map<Long, Long> prev) {

         if(prev.containsKey(money)) {
             return prev.get(money);
         }
         long combinations = 0;
         for(int i = currentIndex; i>= 0; i--) {

             long mod = money % coins.get(i);
             if(mod == 0) {
                 combinations++;
             }
             long division = money / coins.get(i);
             long reps = 0;
             if(mod > 0) {
                  reps = division;
             } else {
                 reps = division -1;
             }
             for(long num = 1; num <= reps; num++) {
                 long remainder = money - coins.get(i)*num;
                 
                 long combs = getComb(remainder,coins, i,prev);
                 if(mod == 0 && combs > 1 || mod > 0 && combs > 0) {
                     combinations+= combs;
                 }
             }
             
         }
         prev.put(money, combinations);
         return combinations;
         
     }
	
}

public class cashCounter {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Long> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
				.collect(toList());

		// Print the number of ways of making change for 'n' units using coins having
		// the values given by 'c'

		long ways = Result.getWays(n, c);
		System.out.println(ways);

	}
}
