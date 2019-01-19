package hackerrank;

import java.util.Scanner;

public class StringLoops {

	public static void main(String[] args) {

		String str = "My Name is Yasir";
		char[] chars = str.toCharArray();
		char fourth = chars[3];
		char fourth2 = str.charAt(3);
		int l = str.length();
		int l2 = chars.length;
		boolean sameLength = l == l2;

//		int totalTests = scan.nextInt();

//		for (int x=0; x<=totalTests; x++) {
//			
//			String strg = scan.next();
//			
//			char[] string = strg.toCharArray();
//			
//			int Length = strg.length();
//			
//			
//			
//		}

		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		String result = evenOdd(input);

		System.out.println(result);

	}

	public static String evenOdd(String str) {

		char[] name = str.toCharArray();

		String odd = "";
		String even = "";

		for (int i = 0; i < name.length; i++) {

			if (i % 2 == 0) {

				even += name[i];

			} else
				odd += name[i];

		}

		return even + " " + odd;

	}

}
