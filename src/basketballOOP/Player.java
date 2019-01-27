package basketballOOP;

public class Player {

	String name;
	int avgRebounds, avgPoints, avgAssists;

	public Player(String name, int pAvgRebounds, int avgPoints, int avgAssists) {
		this.name = name;
		this.avgRebounds = pAvgRebounds;
		this.avgPoints = avgPoints;
		this.avgAssists = avgAssists;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + " Rebounds: " + avgRebounds + " Points: " + avgPoints + " Assists" + avgAssists;
	}

	public boolean equals(Player player2) {
//		return Player.equals(this, player2);

		return this.name.equals(player2.name) && this.avgRebounds == player2.avgRebounds
				&& this.avgPoints == player2.avgPoints && this.avgAssists == player2.avgAssists;

	}

	public static boolean equals(Player player1, Player player2) {
		if (player1.name.equals(player2.name) && player1.avgRebounds == player2.avgRebounds
				&& player1.avgPoints == player2.avgPoints && player1.avgAssists == player2.avgAssists) {
			return true;
		} else
			return false;
	}

	public int total() {
		return avgRebounds + avgPoints + avgAssists;
	}

	public static void compare2players(Player player1, Player player2) {
		if (player1.total() > player2.total()) {
			System.out.println(player1.name + " has better average with total of " + player1.total());

		} else
			System.out.println(player2.name + " has better average with total of " + player2.total());
	}
	
	public static void compareAll(Player player1, Player player2) {
		Player betterPlayer = null;
		if (player1.total() > player2.total()) {
			betterPlayer = player1;
		} else {
			betterPlayer = player2;
		}
		System.out.println(betterPlayer.name + " has better average with total of " + betterPlayer.total());
	}
	
	public static void comp3(Player player1, Player player2) {
		
		// boolExpression ? <in case of true> : <incase of false>
		Player betterPlayer = player1.total() > player2.total() ? player1 : player2;
		System.out.println(betterPlayer.name + " has better average with total of " + betterPlayer.total());
	}
}
