package basketballOOP;

public class MainDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasketballDB myDB = new BasketballDB(5);
		BasketballDB myDB2 = new BasketballDB(5);

		Player yasir = new Player("Yasir", 15, 15, 15);
		myDB.addPlayer(yasir);
		Player yasir2 = new Player("Yasir", 15, 15, 15);
		myDB.addPlayer(yasir2);
		Player zaid = new Player("Zaid" , 11, 11 ,11);
		myDB.addPlayer(zaid);
		
		
		myDB.printPlayers();
		
		Player searchedPlayer = myDB.searchPlayer("Yasir");
		
		System.out.println(searchedPlayer.equals(yasir2));
		
		Player searchedPlayer2 = myDB2.searchPlayer("Yasir");
		
		System.out.println(searchedPlayer2);
		System.out.println("MY DB2 size: " +myDB2.getCurrentSize());
		System.out.println("MY DB size: " + myDB.getCurrentSize());

	}
	

}
