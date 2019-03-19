package datastructures;

import org.junit.jupiter.api.Test;

import iti1121Exercise.CircularLog;

public class TestCircularLog {
	
	@Test
	
	public void testCircularLog() {
		
		CircularLog l = new CircularLog(4);
		l.log("For a variable of a primitive type, the value is found at the address designated by the identifier.");
		l.log("True.");
		l.log("A constructor has a return value and the same name as its class.");
		l.log("False. A constructor has no return value.");
		l.log("An abstract class contains only abstract methods.");
		
		l.get(0); // returns ”True.”
	}
	

}
