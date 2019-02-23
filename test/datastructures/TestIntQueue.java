package datastructures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestIntQueue {

	@Test
	public void testIntQueue() {
		Queue q = new IntQueueArray();
		
		q.enqueue(1);
		q.enqueue(7);
		q.enqueue(-3);
		q.enqueue(100);
		
	assertEquals(4, q.size());
		assertFalse(q.isEmpty());
		
		assertEquals(1, q.dequeue());
		assertEquals(7, q.dequeue());
		assertEquals(-3, q.dequeue());
		assertEquals(100, q.dequeue());
		
		assertTrue(q.isEmpty());
		assertEquals(0, q.size());
	}
}
