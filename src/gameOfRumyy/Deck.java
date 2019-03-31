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
				//cards.add(new Card(suit, cardNum)); another way
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
				//removing all cards at once
				/*
				 * select Hackers.hacker_id , count(distinct challenges.challenge_id) as totalchallenges

from Hackers
 
left join Submissions on Submissions.hacker_id = Hackers.hacker_id
left join Challenges on Submissions.challenge_id = Challenges.challenge_id
left join Difficulty on Difficulty.difficulty_level = Challenges.difficulty_level

where Submissions.score = Difficulty.score

Group by hackers.hacker_id

having count(distinct challenges.challenge_id) > 1
order by totalchallenges
				 */
			}
		}
		return false;
	}

}
