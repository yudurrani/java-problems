package gameOfRumyy;

public class Die {

	int currentDieValue = 3;

	public Die() {

	}

	public int getValue() {

		return currentDieValue;
	}

	public int roll() {
		// +1 as min can be 0 and max will be 5 of Math.random() * 6
		//+1 makes our range 1-6 instead of 0-5
		currentDieValue = (int) ((Math.random() * 6) + 1);
		return currentDieValue;
	}

	public String toString(){
		return "Die {value:" + currentDieValue+ "}";
	
	
	}

}
