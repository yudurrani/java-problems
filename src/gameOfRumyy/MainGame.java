package gameOfRumyy;

import java.util.ArrayList;

public class MainGame {

	/*
	 * Our implementation of the game consists of 6 classes: Die, Card, Deck, Game,
	 * Run, and Utils. In the following sections, we describe the requirements for
	 * each class
	 */

	public static void main(String[] args) {

		Die d;
		d = new Die();
		System.out.println(d.getValue());
		d.roll();
		System.out.println(d.getValue());
		System.out.println(d);

		Card a, b, c;
		a = new Card(2, 7);
		b = new Card(2, 8);
		c = new Card(2, 9);
		System.out.println(a);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

		Deck newDeck = new Deck();
		
		newDeck.add(a);
		newDeck.add(b);
		newDeck.add(c);

		System.out.println(newDeck.isSeq());

	}

}