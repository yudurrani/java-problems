package part1;

import java.util.Scanner;

public class IPO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");// to print
		Scanner scan = new Scanner(System.in);// System.in to read from system input, scanner to read system input
		
		int x = scan.nextInt();// read integer
		
		String rStr = scan.next();// reads next string in input
		
		scan.nextLine();
		
		String line = scan.nextLine();// read next line in the input
		
		System.out.println("rStr: " + rStr);//
		
		System.out.println("line: " + line);
		
		System.out.println("x: " + x);
		
		String str = " hello ";
		
		str = str + " ji ";
		
		str += " hi ";
		
		x += 10;
		
	
		
		System.out.println(x + str);

	}

}
