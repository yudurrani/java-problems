package basketballOOP;

public class BasketballDB {
	
	Player[] players;
	int currentSize = 0 ;
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
		
		for( int i=0 ; i <currentSize; i++) {
//			System.out.println(players[i].toString());
			System.out.println(players[i]);//java automatically calls toString() on every object when it tries to convert to String
		}
	
	}
	
	public Player searchPlayer (String name) {
		for (int x =0 ; x <currentSize; x++) {
			
			if (players[x].name.equals(name)) {
				
				return players[x];
				
				
			}
		}
		return null;
		
	}
}
