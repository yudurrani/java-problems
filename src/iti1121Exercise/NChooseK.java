package iti1121Exercise;

import java.math.BigInteger;

public class NChooseK {

	static long counter = 0;
	public static void main(String[] args) {

		System.out.println(kNs(333, 60));
		System.out.println("Number of computations with dynamic: "+counter);
		counter = 0;
		System.out.println(kNsOld(333, 60));
		System.out.println("Number of computations with plain recursive: "+counter);

	}
	
	public static BigInteger kNsOld(int n, int k) {
		if ((n > 0 && k == 0) || n == k) {
			return new BigInteger("1");
		}
		counter++;
		return kNsOld(n-1,k-1).add(kNsOld(n-1,k));
	}

	public static BigInteger kNs(int n, int k) {
		BigInteger[][] twoDi = new BigInteger[n+1][k+1];
		return kNs(twoDi, n, k);

	}

	public static BigInteger kNs(BigInteger[][] twoD, int n, int k) {

		if ((n > 0 && k == 0) || n == k) {
			return new BigInteger("1");
		}

		else {
			if (twoD[n][k] == null) {
				twoD[n][k] = kNs(twoD, n - 1, k - 1).add(kNs(twoD, n - 1, k));
				counter++;
			}
			return twoD[n][k];

		}
	}

}
