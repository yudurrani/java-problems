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

		handDeck.addAll(newDeck.deal(7));

		die = new Die();

	}

	public void play() {

		while (handDeck.size() != 0) {

			if (die.roll() == 1) {
				handDeck.removeFirst();

			} else {
				int newCards = Math.min(die.getValue(), newDeck.size());
				handDeck.addAll(newDeck.deal(newCards));

				handDeck.sortByRank();
				Deck sameRank = new Deck();

				Card previousCard = handDeck.get(0);
				sameRank.add(previousCard);

				for (int i = 1; i < handDeck.size(); i++) {

					Card currentCard = handDeck.get(i);

					if (currentCard.equals(previousCard)) {
						sameRank.add(currentCard);

					} else {
						if (sameRank.isKind()) {
							handDeck.removeAll(sameRank);
						}

						sameRank = new Deck();
						previousCard = currentCard;
						sameRank.add(previousCard);
					}

				}

				handDeck.sortBySuit();

				Deck sameSeq = new Deck();

				Card lastCard = handDeck.get(0);

				sameSeq.add(lastCard);

				for (int i = 1; i < handDeck.size(); i++) {

					Card currentCard = handDeck.get(i);

					if (currentCard.getSuit() == lastCard.getSuit()
							&& currentCard.getRank() == lastCard.getRank() + 1) {
						sameSeq.add(currentCard);

					} else {
						if (sameSeq.isSeq()) {
							handDeck.removeAll(sameSeq);
						}

						sameSeq = new Deck();
						lastCard = currentCard;
						sameSeq.add(lastCard);
					}

				}

			}

		}
	}
}
