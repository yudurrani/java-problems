package datastructures;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class TestLinkedList {
	
	@Test
	
	public void testLinkedList() {
		LinkedList<Integer> list = new LinkedList<Integer>() ;
		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		assertTrue(5 == list.get(0) );
		assertTrue(6 == list.get(1) );
		assertTrue(7 == list.get(02) );
		assertTrue(8 == list.get(3) );
	}

	@Test
	public void testIterator() {
		LinkedList<Integer> list = new LinkedList<Integer>() ;
		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		
		Iterator<Integer> iterator = list.iterator();
		Iterator<Integer> iterator2 = list.iterator();

		iterator.next();//returns 5
		
		iterator.next();//returns 6
		
		iterator2.next();//return 5
		
		
	}

	
}
