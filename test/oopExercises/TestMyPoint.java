package oopExercises;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMyPoint {

	@Test
	
	public void TestPointing() {
		MyPoint firstPoint = new MyPoint(6,8);
		MyPoint secondPoint = new MyPoint(9,11);
	
		assertEquals( 6, firstPoint.getX());
		assertEquals( "(6,8)" , firstPoint.toString());
		assertEquals( 11, secondPoint.getY());
	
	
		
	}
	
	@Test 
	
	public void testDis() {
		MyPoint firstPoint = new MyPoint(6,8);
		
		
		assertEquals ( 5.0 , firstPoint.distance(2,5), 0);
		
		// (6-2) = 16
		// (8-5) = 9
		
		// 5
		
	}
	
}
