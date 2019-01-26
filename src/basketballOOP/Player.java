package basketballOOP;

public class Player {
	
	String name;
	int avgRebounds, avgPoints, avgAssists;
	
	
	public Player(String name, int pAvgRebounds, int avgPoints, int avgAssists) {
		this.name=name;
		avgRebounds = pAvgRebounds;
		this.avgPoints = avgPoints;
		this.avgAssists = avgAssists;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + " Rebounds: " + avgRebounds +" Points: "+avgPoints +" Assists"+avgAssists;
	}
	
	public boolean equals(Player player2) {
//		return Player.equals(this, player2);
		
		return this.name.equals(player2.name) && this.avgRebounds==player2.avgRebounds && this.avgPoints==player2.avgPoints && this.avgAssists==player2.avgAssists;

	}

	public static boolean equals(Player player1,Player player2) {
		if (player1.name.equals(player2.name) && player1.avgRebounds==player2.avgRebounds && player1.avgPoints==player2.avgPoints && player1.avgAssists==player2.avgAssists) {
			return true;
		}
		else return false;
	}
}
