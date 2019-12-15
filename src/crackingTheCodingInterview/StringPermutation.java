package crackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

	// Given two strings, write a method to decide if one is a permutation of the
	// other

	// lets give 2 strings first
	// permutation is basically sets of chars of that string
	// we will first check our null cases and exceptional cases
	// if both are strings with more than 1 char and have similar string length

	// option 1: n sq solution
	// we will make char array of both strings
	// and check if first string have all the same elements as second one by
	// hashmaping the first string

	// option 3:
	// make all permutation of first word and then check if any of it is similar to
	// second

	public static void main(String[] args) {

		// given two strings

		String first = "ybab";
		String second = "babi";

		// check if second string is in permutation of first

		System.out.println(checkPermu(first, second));

	}

	public static boolean checkPermu(String a, String b) {

		if (a.equals(null) || a.equals("")) {
			System.out.println("No String entered to check");
			return false;
		}

		// checking if string is passed

		else if (!a.matches("^[a-zA-Z]*$") || !b.matches("^[a-zA-Z]*$")) {
			System.out.println("Please enter alphabets only");
			return false;
		}

		else if (a.length() != b.length()) {
			return false;
		}

		else {

			char[] firstArray = a.toCharArray();
			char[] secondArray = b.toCharArray();

			Map<Character, Integer> firstMap = new HashMap<Character, Integer>();
			Map<Character, Integer> secondMap = new HashMap<Character, Integer>();

			for (int i = 0; i < firstArray.length; i++) {

				if (firstMap.get(firstArray[i]) == null) {
					firstMap.put(firstArray[i], 1);
				}

				else {
					int value = firstMap.get(firstArray[i]);
					value++;
					firstMap.put(firstArray[i], value);
				}
			}

			for (int i = 0; i < secondArray.length; i++) {

				if (secondMap.get(secondArray[i]) == null) {
					secondMap.put(secondArray[i], 1);
				}

				else {
					int value = secondMap.get(secondArray[i]);
					value++;
					secondMap.put(secondArray[i], value);
				}
			}

			// checking if the characters are similar in both strings with their values

			for (int i = 0; i < firstArray.length; i++) {
				if (secondMap.get(firstArray[i]) == null) {
					return false;
				}

				else if (secondMap.get(firstArray[i]) != firstMap.get(firstArray[i])) {
					return false;
				}

			}
			return true;

		}
	}

};
