package datastructures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestIntStack {
	@Test
	public void testIntStack() {
		Stacks q = new IntStacksArrayList();

		q.push(1);
		q.push(5);
		q.push(-6);
		q.push(52);

		assertEquals(4, q.size());
		assertEquals(false, q.isEmpty());

		assertEquals(52, q.pop());
		assertEquals(-6, q.pop());
		assertEquals(5, q.pop());
		assertEquals(1, q.pop());

		assertTrue(q.isEmpty());
		assertEquals(0, q.size());

	}

}
