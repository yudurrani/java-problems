package datastructures;

public class God {
	final String name = "Allah";
	private static God onlyGod;
	private God() {
		
	}
	
	public static God findGod() {
		
		if ( onlyGod == null ) {
			
			onlyGod = new God();
			
		}
		
		
		return onlyGod;
	}
}
