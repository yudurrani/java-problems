package part1again.cars;

public class Camry extends Toyota{

	Camry(String color, boolean isAutomatic) {
		super(color, 3, 220, 4, isAutomatic);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double acceleration() {
		// TODO Auto-generated method stub
		currentSpeed+=15.0;
		
		return currentSpeed;
	}
	
	@Override
	public double decceleration() {
		// TODO Auto-generated method stub
		currentSpeed-=15;
		
		return currentSpeed;
	}
}
