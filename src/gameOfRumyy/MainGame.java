package gameOfRumyy;

import java.util.ArrayList;

public class MainGame {

	Deck newDeck;
	Deck handDeck;
	Die die;

	public MainGame(int ranks) {

		newDeck = new Deck(ranks);

		newDeck.shuffle();

		handDeck = new Deck();

		for (int i = 0; i < 7; i++) {

			handDeck.add(newDeck.removeLast());
		}

		die = new Die();

	}

	public void play() {

	}
}