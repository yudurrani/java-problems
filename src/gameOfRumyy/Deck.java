package gameOfRumyy;

import java.util.ArrayList;
import java.util.Collection;

public class Deck {

	int totalCards;
	ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();

	}

	public Deck(int n) {
		// n is the total number of ranks
		totalCards = 4 * n;
		cards = new ArrayList<Card>();
	}

	public int size() {
		return totalCards;
	}

	public boolean hasCards() {
		return totalCards != 0;
	}

	public Card get(int pos) {
		// this function calls the card on the asked position
		return cards.get(pos - 1);
	}
	// use arrayList

	public void add(Card card) {
		cards.add(card);
		totalCards++;
	}

	@SuppressWarnings("unchecked")
	public void addAll(Deck other) {
		// this will add all the other cards of deck into this deck
//		while (other.hasNext()) {
		cards.addAll((Collection<? extends Card>) other);
		while (totalCards != 0) {
			other.removeLast();
		}
	}

	public Card removeLast() {
		Card temp = cards.get(totalCards - 1);
		cards.remove(totalCards - 1);
		totalCards--;
		return temp;
	}

	public Card removeFirst() {
		Card temp = cards.get(0);
		cards.remove(0);
		totalCards--;
		return temp;
	}
	
	

}
