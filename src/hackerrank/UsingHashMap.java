package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class UsingHashMap {

	static boolean isAnagram(String a, String b) {
		if (a == null || b == null || a.length() != b.length()) {
			return false;
		}
		a = a.toLowerCase();
		b = b.toLowerCase();

		char charA[] = a.toCharArray();
		HashMap<Character, Integer> mapAnagram = new HashMap<Character, Integer>();
		for (int i = 0; i < charA.length; i++) {
			if (mapAnagram.containsKey(charA[i])) {
				mapAnagram.put(charA[i], mapAnagram.get(charA[i]) + 1);
			} else {
				mapAnagram.put(charA[i], 1);
			}
		}

		char charB[] = b.toCharArray();
		HashMap<Character, Integer> mapAnagram2 = new HashMap<Character, Integer>();
		for (int i = 0; i < charA.length; i++) {
			if (mapAnagram2.containsKey(charB[i])) {
				mapAnagram2.put(charB[i], mapAnagram2.get(charB[i]) + 1);
			} else {
				mapAnagram2.put(charB[i], 1);

			}
		}
		
		if (mapAnagram.equals(mapAnagram2)) {
			return true;
			
		}
		else return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);

		
		System.out.println(ret);
	}

}
