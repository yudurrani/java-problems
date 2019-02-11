package hackerrank;

public class SumOfLargeNumbers {
	static long aVeryBigSum(long[] ar) {
        long sum=0;
        for( int x=0; x<ar.length; x++){

            sum = sum + ar[x];

        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = {10000000l, 12212122l, 33232423432l};
		
		System.out.println(aVeryBigSum(arr));
	}

}
