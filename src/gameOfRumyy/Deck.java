package gameOfRumyy;

import static org.junit.Assert.assertThat;

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
		// return cards.remove(card); does the same thing
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
		int size = cards.size();
		if (size != 0) {

			for (int x = 0; x < size / 2; x++) {

				int firstCardPlace = (int) (Math.random() * size);
				int secondCardPlace = (int) (Math.random() * size);
				Card temp = cards.get(firstCardPlace);
				cards.set(firstCardPlace, cards.get(secondCardPlace));
				cards.set(secondCardPlace, temp);
			}

		}

	}

	public Deck deal(int n) {
		Deck newDeck = new Deck();
		for (int x = 0; x < n; x++) {
			newDeck.add(removeLast());
		}
		return newDeck;
	}
//  assertEquals(deck.contains(new Card(3, 2)), true);
	public boolean contains(Card card) {
		for (int n = 0; n < size(); n++) {
			if (card.equals(cards.get(n))) {

				return true;
			}
		}
		return false;
	}

	public boolean containsAll(Deck other) {

		for(Card card : other.cards) {
			if(!contains(card)) {
				return false;
			}
		}
		return true;
	}

	public boolean isKind() {

		if (size() >= 2) {
			// Starting all the cards from 1 because comparing it from Card(0)
			for (int i = 1; i < size(); i++) {
				if (cards.get(i).getRank() != (cards.get(0).getRank()))
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean isSeq() {

		if (size() >= 3) {
		
			for (int i = 1; i < size(); i++) {
				boolean isInvalidSuit = cards.get(i).getSuit() != cards.get(0).getSuit();
				boolean isInvalidRank = (cards.get(0).getRank() + i) != cards.get(i).getRank();
				if (isInvalidSuit || isInvalidRank) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public void sortByRank() {

		for (int i = 0; i < size(); i++) {
			for (int x = 0; x < size(); x++) {
				if (cards.get(i).getRank() < cards.get(x).getRank()) {

					Card temp = cards.get(i);
					cards.set(i, cards.get(x));
					cards.set(x, temp);
				}
			}
		}
	}
	
	public void sortBySuit() {
		for (int i = 0; i < size(); i++) {
			for (int x = 0; x < size(); x++) {
				if (cards.get(i).getSuit() < cards.get(x).getSuit()) {

					Card temp = cards.get(i);
					cards.set(i, cards.get(x));
					cards.set(x, temp);
				}
			}
		}
		
	}
	
	public void print() {
		for ( int i = 0 ; i < size () ; i++) {
			System.out.println("Suit :" + cards.get(i).getSuit() + "  Rank :" + cards.get(i).getRank());
		}
	}

}
