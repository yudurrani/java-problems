package basketballOOP;

public class BasketballDB {

	Player[] players;
	int currentSize = 0;

	public BasketballDB(int numOfPlayers) {
		players = new Player[numOfPlayers];
	}

	public void addPlayer(Player p) {
		players[currentSize] = p;
		currentSize++;

	}

	public int getCurrentSize() {
		return currentSize;
	}

	public void printPlayers() {

		for (int i = 0; i < currentSize; i++) {
//			System.out.println(players[i].toString());
			System.out.println(players[i]);// java automatically calls toString() on every object when it tries to
											// convert to String
		}

	}

	public Player searchPlayer(String name) {
		for (int x = 0; x < currentSize; x++) {

			if (players[x].name.equals(name)) {

				return players[x];

			}
		}
		return null;

	}

	public void displayCompare(Player player1, Player player2) {

		System.out.println(player1.name + "\t" + player2.name + "\n" + player1.avgRebounds + "\t" + player2.avgRebounds
				+ "\n" + player1.avgPoints + "\t" + player2.avgPoints + "\n" + player1.avgAssists + "\t"
				+ player2.avgAssists + "\n" + player1.total() + "\t" + player2.total());

		System.out.println(" ");

	}

	public void displayAll() {

		int max = Integer.MIN_VALUE;
		String name = null;

		for (int x = 0; x < currentSize; x++) {
			System.out.println(players[x]);

			if (players[x].total() > max) {
				max = players[x].total();
				name = players[x].name;

			}

		}
		System.out.println(name + " best average with total of " + max);
	}
}