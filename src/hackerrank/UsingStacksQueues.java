package hackerrank;

import java.io.*;
import java.util.*;

public class UsingStacksQueues {
	// Write your code here.
	int forStack;
	int forQueue;
	char chrS[]= new char[100];
	char chrQ[]= new char[100];

	public void pushCharacter(char ch) {
		
		chrS[forStack] = ch;
		forStack++;

	}

	public void enqueueCharacter(char ch) {
		
		chrQ[forQueue] = ch;
		forQueue++;
	}

	public char popCharacter() {
		char x = chrS[forStack-1];
		forStack--;
		return x;
	}

	public char dequeueCharacter() {
		char y = chrQ[0];
		for (int i = 0; i < forQueue; i++) {
			chrQ[i] = chrQ[i + 1];

		}
		forQueue--;
		return y;

	}

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();

	        // Convert input String to an array of characters:
	        char[] s = input.toCharArray();

	        // Create a Solution object:
	        UsingStacksQueues p = new UsingStacksQueues();

	        // Enqueue/Push all chars to their respective data structures:
	        for (char c : s) {
	            p.pushCharacter(c);
	            p.enqueueCharacter(c);
	        }

	        // Pop/Dequeue the chars at the head of both data structures and compare them:
	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length; i++) {
	        	char qChar = p.dequeueCharacter();
	        	char sChar = p.popCharacter();
	            if (qChar != sChar) {
	                isPalindrome = false;                
	                break;
	            }
	        }

	        //Finally, print whether string s is palindrome or not.
	        System.out.println( "The word, " + input + ", is " 
	                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	    }
}


