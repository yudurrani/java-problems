package gameOfRumyy;

public class Die {

	int currentDieValue = 3;
	int newDieValue = 4;

	public Die() {

	}

	public int getValue() {

		return currentDieValue;
	}

	public int roll() {
		newDieValue = (int) ((Math.random() * ((6 - 1) + 1)) + 1);
		currentDieValue = newDieValue;
		return newDieValue;
	}

	public String toString(){
		return "Die {value:" + currentDieValue+ "}";
	
	
	}

}
