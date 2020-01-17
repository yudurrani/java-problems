package crackingTheCodingInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Trie {
	
	private class TrieNode{
		boolean isWord;
		Map<Character, TrieNode> children;
		
		public TrieNode() {
			isWord = false;
			children = new HashMap<>();
		}
		
	}
	
	private final TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		TrieNode current = root;
		
		for( int i =0; i< word.length(); i++) {
			
			char ch = word.charAt(i);
			
			TrieNode node = current.children.get(ch);
			
			if ( node == null) {
				node = new TrieNode();
				current.children.put(ch, node);				
			}
			current = node;						
		}
		current.isWord = true;
	}
	
	public boolean search( String word) {
		TrieNode current = root;
		
		for ( int i =0; i< word.length(); i++) {
			char ch = word.charAt(i);
			
			TrieNode node = current.children.get(ch);
			if( node == null) {
				return false;
			}
			current = node;
						
		}
		return current.isWord;
		
	}
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int nItr = 0; nItr < n; nItr++) {
            String[] opContact = scanner.nextLine().split(" ");

            String op = opContact[0];

            String contact = opContact[1];
        }

        scanner.close();
    }
	
//	public static void main(String[] args) {
//
//		final List<String> setOfStrings = new ArrayList<>();
//		setOfStrings.add("pqrs");
//		setOfStrings.add("pprt");
//		setOfStrings.add("psst");
//		setOfStrings.add("pqrs");
//
//		final Trie trie = new Trie();
//
//		setOfStrings.forEach(trie::insert);
//		System.out.println(trie.search("pqrs"));
//
//	}
	

}
