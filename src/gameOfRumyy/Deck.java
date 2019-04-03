package gameOfRumyy;

import java.util.ArrayList;

public class Deck {

//	int totalCards;
	ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();

	}

	public Deck(int rank) {
		// n is the total number of ranks

		cards = new ArrayList<Card>(4 * rank);

		for (int suit = 1; suit <= 4; suit++) {

			for (int cardNum = 1; cardNum <= rank; cardNum++) {

				Card newCard = new Card(suit, cardNum);

				cards.add(newCard);
				// cards.add(new Card(suit, cardNum)); another way
			}

		}

	}

	public int size() {
		return cards.size();
	}

	public boolean hasCards() {
		return cards.size() != 0;
	}

	public Card get(int pos) {
		// this function calls the card on the asked position
		return cards.get(pos - 1);
	}
	// use arrayList

	public void add(Card card) {
		cards.add(card);
	}

	public void addAll(Deck other) {
		cards.addAll(other.cards);
	}

	public Card removeLast() {
		return cards.remove(size() - 1);
	}

	public Card removeFirst() {
		return cards.remove(0);
	}

	public boolean remove(Card card) {
		for (int n = 0; n < size(); n++) {
			if (card == cards.get(n)) {
				cards.remove(n);
				return true;
			}
		}
		return false;
	}

	public boolean removeAll(Card card) {
		for (int n = 0; n < size(); n++) {
			if (card == cards.get(n)) {
				cards.remove(n);
				return true;

			}
		}
		return false;
	}
	
	public void removeAll(Deck other) {
		this.cards.removeAll(other.cards);
		
	}
	
	public void shuffle() {
		if (cards.size() != 0) {
			
		}
		
	}
	
	
}
