package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String[] names = new String[n];
		int[] phoneN = new int[n];

		Map<String, String> hmap = new HashMap();
		for (int i = 0; i < n; i++) {
			String name = scan.next();
			int phone = scan.nextInt();
			// Write code here
			hmap.put(name, Integer.toString(phone));

			

		}
		
		

	

		while (scan.hasNext()) {
			String s = scan.next();
			// Write code here
			
			if (hmap.containsKey(s)) {
				System.out.println(s + "=" + hmap.get(s));
			}
			
			else System.out.println("Not found");
		}

	}

}
