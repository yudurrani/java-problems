package oopExercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCircle {
	@Test
	public void testCircleRadius() {

		Circle sheesha = new Circle(10.5);
		Circle abc = new Circle(5.5);
		

		assertEquals(10.5, sheesha.getRadius());
		assertEquals(5.5, abc.getRadius());
		

	}

	@Test
	public void testCircleColor() {
		
		Circle sheeshaa = new Circle( 11.0 , "orange");
		Circle ring = new Circle(22.0, "white");
		
		assertEquals( 11.0, sheeshaa.getRadius());
		assertEquals("orange" , sheeshaa.getColor());
		
		assertEquals(22.0, ring.getRadius());
		assertEquals("white", ring.getColor());
		
		
	}
}
