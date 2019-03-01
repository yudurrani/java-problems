package pairs;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import part1again.cars.Car;
import part1again.cars.Mazda;
import part1again.cars.Mazda6;
import sortInterface.Person;

public class Test2Objects {
	
	@Test
	
	public void test2Objects() {
		Person Yasir = new Person("Yasir", 32, 165);
		Person Zaid = new Person("Zaid", 23, 165);

		Mazda6 mazda6= new Mazda6("Red", true);
		
		Store2Objects<Person, Mazda6> storing= new Store2Objects<Person, Mazda6>(Yasir, mazda6);
		
		assertEquals(Yasir, storing.x);
		assertEquals(mazda6, storing.y);
		
		assertEquals(Yasir.getAge(), storing.x.getAge());
		
  	}

}
