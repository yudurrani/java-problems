package datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import iti1121Exercise.CircularLog;

public class TestCircularLog {

	@Test

	public void testCircularLog() {

		CircularLog l = new CircularLog(4);
		l.log("For a variable of a primitive type, the value is found at the address designated by the identifier.");
		l.log("True.Yes");
		l.log("A constructor has a return value and the same name as its class.");
		l.log("False. A constructor has no return value.");
		l.log("An abstract class contains only abstract methods.");

		assertEquals("True.Yes", l.get(0));
		assertEquals(4, (l.size()));

		Iterator<String> iterator = l.iterator();

		assertTrue(iterator.hasNext());

		assertEquals("True.Yes", iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals("A constructor has a return value and the same name as its class.", iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals("False. A constructor has no return value.", iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals("An abstract class contains only abstract methods.", iterator.next());

		assertFalse(iterator.hasNext());

	}

}
