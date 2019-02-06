package part1again.cars;



public class MainBodyCar {
	
	
	public static void main(String [] args ) {
		
		Car[] cars  = new Car[3];
		Car myCar=new Mazda6("Red", true);
		Car youCar=new Camry("White",true);
		ICar car2=new Camry("White",true);
		cars[0] = new Camry("White",true);
		cars[1] = new Corrolla("White",true);
		cars[2] = new Mazda6("White",true);

		for(int i =0; i < cars.length; i++) {
			cars[i].acceleration();
		}
		myCar.print();
		youCar.print();
		youCar.decceleration(); 
		youCar.acceleration();
		((Camry)youCar).decceleration();

		((Camry)youCar).acceleration();
		
	}

}
