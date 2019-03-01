package datastructures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestIntStack {
	@Test
	public void testIntStack() {
		Stacks<Integer> q = new IntStacksArrayList<Integer>();

		q.push(1);
		q.push(5);
		q.push(-6);
		q.push(52);

		assertEquals(4, q.size());
		assertEquals(false, q.isEmpty());

		assertTrue(52==q.pop());
		assertTrue(-6==q.pop());
		assertTrue(5==q.pop());
		assertTrue(1==q.pop());

		assertTrue(q.isEmpty());
		assertEquals(0, q.size());

	}

	@Test
	public void testLinkedStack() {
		Stacks<Integer> q = new LinkedStack<Integer>();

		q.push(1);
		q.push(5);
		q.push(-6);
		q.push(52);

		assertEquals(4, q.size());
		assertEquals(false, q.isEmpty());

		assertTrue(52==q.pop());
		assertTrue(-6==q.pop());
		assertTrue(5==q.pop());
		assertTrue(1==q.pop());

		assertTrue(q.isEmpty());
		assertEquals(0, q.size());
		
			q.pop();
			System.out.println("Does this print?");
		
		System.out.println("This prints");
	}
}
