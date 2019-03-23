package gameOfRumyy;

public class Die {

	int currentDieValue;
	int newDieValue ;

	public Die() {
		currentDieValue = 3;
	}

	

	public int getValue() {
		
		currentDieValue = newDieValue ;

		return currentDieValue;
	}
	
	public int roll() {
		int newDieValue = (int) ((Math.random() * ((6 - 1) + 1)) + 1);
		return newDieValue;
	}
	
	public String d() {
		return "Die { value : " + getValue() + "}";
		
	
	}

}
