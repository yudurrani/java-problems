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

		final Triee trie = new Triee();

		setOfStrings.forEach(trie::insert);
		System.out.println(trie.query("pqrs"));

	}
}

class Triee {
	final TrieNode root;

	public Triee() {
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

}

