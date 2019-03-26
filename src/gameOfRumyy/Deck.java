package gameOfRumyy;

import java.util.ArrayList;


public class Deck {
	
	int totalCards;
	ArrayList<Card> cards ;
	
	
	
	public Deck() {
		cards = new ArrayList<Card>();
		
	}
	
	public Deck(int n) {
		totalCards = 4 * n ;
		cards = new ArrayList<Card>();
		
	}
	
	public int size() {
		return totalCards;
	}
	
	public boolean hasCards() {
		return totalCards != 0 ;
	}
	
	public Card get(int pos) {
		return cards.get(pos-1)  ;
	}
	// use arrayList
	
	public void add (Card card) {
		cards.add(card) ;
		totalCards++ ;
	}

}
