package part1again.cars;

public class Corrolla extends Toyota{

	Corrolla(String color, boolean isAutomatic) {
		super(color, 1.6, 160, 4, isAutomatic);
		// TODO Auto-generated constructor stub
	}
	
	public double acceleration() {
		// TODO Auto-generated method stub
		currentSpeed+=5.0;
		
		return currentSpeed;
	}
	
	@Override
	public double decceleration() {
		// TODO Auto-generated method stub
		currentSpeed-=5;
		
		return currentSpeed;
	}

}
