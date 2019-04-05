package gameOfRumyy;

public class Card {
	 /*
	 * You must implement the class Card. • An object of the class Card stores a
	 * suit and a rank, both of type int. • The class declares one constructor. It
	 * receives the initial value for the suit and the rank as parameters. • Each
	 * object has two “getters”, getSuit and getRank, which returns the value of the
	 * suit and the rank, respectively. • An object of the class Card has a method
	 * equals with a parameter of type Object. If the object designated by the
	 * parameter is not of type Card, the method returns false, as these objects
	 * cannot be considered “equals”. Otherwise, the method returns true if and only
	 * if the object designated by parameter is a Card that has the same suit and
	 * the same rank
	 */

	int suit;
	int rank;

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public boolean equals(Card c) {

		return (c.suit == suit) && (c.rank == rank);
	}

	public String toString() {
		return "{" + suit + "," + rank + "}";
	}

	public static final int CLUB = 1;
	public static final int DIAMOND = 0;
	public static final int HEART = 2;
	public static final int SPADE = 3;
}
