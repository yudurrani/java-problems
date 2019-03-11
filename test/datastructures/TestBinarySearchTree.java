package datastructures;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
			
			assertTrue(tree.contains(50));
			assertTrue(tree.contains(22));
			
			
			tree.printInOrder();
			tree.printPreOrder();
			tree.printPostOrder();
			
			System.out.println("Does this print?");
			
		
	}

}
