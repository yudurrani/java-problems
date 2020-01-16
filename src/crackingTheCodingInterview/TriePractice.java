package crackingTheCodingInterview;

import java.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TriePractice {

	public static void main(String[] args) {

		final List<String> setOfStrings = new ArrayList<>();
		setOfStrings.add("pqrs");
		setOfStrings.add("pprt");
		setOfStrings.add("psst");
		setOfStrings.add("pqrs");

		final Trie trie = new Trie();

		setOfStrings.forEach(trie::insert);
		System.out.println(trie.query("pqrs"));

	}
}

class Trie {
	final TrieNode root;

	public Trie() {
		this.root = new TrieNode();
	}

	public int query(final String s) {
		TrieNode current = root;

		for (int i = 0; i < s.length(); i++) {

			if (current == null) {
				return 0;
			}

			current = current.next(s.charAt(i));

		}
		return current.terminating;
	}

	public void insert(String s) {
		TrieNode current = root;

		for (int i = 0; i < s.length(); i++) {
			if (current.trieNodes[s.charAt(i) - 'a'] == null) {
				current.trieNodes[s.charAt(i) - 'a'] = new TrieNode();
			}
			current = current.next(s.charAt(i));
		}
		current.terminating++;
	}
}

class TrieNode {
	int terminating;
	final TrieNode[] trieNodes = new TrieNode[26];

	public TrieNode next(final char c) {
		return trieNodes[c - 'a'];
	}

	// HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();

	// void TrieNode(){

	// }

	// void TrieNode(char c){
	// this.c = c;
	// }
}

//	private static final Scanner scanner = new Scanner(System.in);

//		int n = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		for (int nItr = 0; nItr < n; nItr++) {
//			String[] opContact = scanner.nextLine().split(" ");
//
//			String op = opContact[0];
//
//			String contact = opContact[1];
//		}
//
//		scanner.close();
//	}

//package crackingTheCodingInterview;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class TriePractice {
//
//	class TrieNode {
//		char data;
//		HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
//		boolean isWord;
//
//		void addChild(TrieNode n) {
//			children.put(n.data, n);
//
//		}
//
//		boolean hasChild(char c) {
//			return children.containsKey(c);
//		}
//
//	}
//
//}
//
//public class Trie {
//
//	TrieNode root;
//
//	}
//
//	private static final Scanner scanner = new Scanner(System.in);
//
//	public static void main(String[] args) {
//	        int n = scanner.nextInt();
//	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        for (int nItr = 0; nItr < n; nItr++) {
//	            String[] opContact = scanner.nextLine().split(" ");
//
//	            String op = opContact[0];
//
//	            String contact = opContact[1];
//	        }
//
//	        scanner.close();
//	    }
//}
//
//}
