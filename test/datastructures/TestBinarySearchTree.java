package datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class TestBinarySearchTree {
	
	@Test
	
	public void testBinaryTree() {
		
		BinarySearchTree tree = new BinarySearchTree() ;
			
			tree.add(25);
			tree.add(15);
			tree.add(50);
			tree.add(10);
			tree.add(22);
			tree.add(35);
			tree.add(70);
			tree.add(4);
			tree.add(12);
			tree.add(18);
			tree.add(24);
			tree.add(31);
			tree.add(44);
			tree.add(66);
			tree.add(90);
			
			assertTrue(tree.contains(50));
			assertTrue(tree.contains(22));
			
			
			System.out.println("In Order");
			tree.printInOrder();
			
			System.out.println("Now PreOrder");
			tree.printPreOrder();
			tree.printPostOrder();
			
			//
			
			tree.remove(66);
			System.out.println("In Order");
			tree.printInOrder();
			assertFalse(tree.contains(66));
			
			tree.remove(25);
			System.out.println("In Order");
			tree.printInOrder();
			assertFalse(tree.contains(25));
			
			Iterator<Integer> yasir = tree.iterator();
			
			assertTrue(yasir.next() == 4 );
			assertTrue(yasir.next() == 10 );
			assertTrue(yasir.next() == 12 );
			assertTrue(yasir.next() == 15 );
			assertTrue(yasir.next() == 18 );
			assertTrue(yasir.next() == 22 );
			assertTrue(yasir.hasNext());
			
			
		
	}

}
