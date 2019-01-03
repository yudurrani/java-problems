package part1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);// System.in to read from system input, scanner to read system input
		System.out.println( "Whats your name?"); //asking name
		String personName = scan.next();// reads next string in input
		
		System.out.println("Hello " + personName + " Get me coffee");

		
	}

}
