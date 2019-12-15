package crackingTheCodingInterview;

import java.util.Scanner;

public class SpaceReplacement {

	/*
	 * Write a method to replace all spaces in a string with'%20'. You may assume
	 * that the string has sufficient space at the end of the string to hold the
	 * additional characters, and that you are given the "true" length of the
	 * string. (Note: if implementing in Java, please use a character array so that
	 * you can perform this operation in place.) EXAMPLE Input: "Mr John Smith
	 * Output: "Mr%20Dohn%20Smith"
	 */

	//

	public static void main(String[] args) {

		String sentenceWithSpace, sentenceWithoutSpace;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Sentence, you want to remove spaces from");

		sentenceWithSpace = scan.nextLine();

		// by using replace all
		
		sentenceWithoutSpace = sentenceWithSpace.replaceAll(" ", "%20");
		
		System.out.println(sentenceWithoutSpace);
		
		// by using a char array
		
		char[] strArray = sentenceWithSpace.toCharArray();
		
		
		StringBuffer sb = new StringBuffer(sentenceWithSpace.length());
		
		for ( int i=0; i < strArray.length; i++) {
			if( (strArray[i] != ' ' ) && (strArray[i] != '\t')) {
				
				sb.append(strArray[i]);
				
			} 
			else if((i>0) && strArray[i-1] == ' ') {
	//			sb.append('');
			}
				
			else sb.append("%20");
			
			
		}

		
		System.out.println(sb);


		
		
		
	}

}
