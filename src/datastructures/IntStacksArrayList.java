package datastructures;

import java.util.ArrayList;

public class IntStacksArrayList implements Stacks {

	int[] array;

	int n;

	IntStacksArrayList() {

		array = new int[10];
	}

	public void push(int i) {

		array[n] = i;
		n++;

	}

	@Override
	public int pop() {
		 int temp = array[n-1];
		 
		 n-- ;
		 
		return temp;
	
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return array[n-1];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return n==0;
	}
	/*
	 * Queues are First in First out (FIFO). Stacks are Last in Last out (LIFO)
	 * 
	 * A stack should have the following methods:
	 * 
	 * push: should accept an integer and put it at the top of the stack pop: should
	 * *REMOVE* and return the integer at the top of the stack peek: should *ONLY*
	 * return/show the integer at the top of the stack isEmpty: should tell you if
	 * stack is empty size: the number of elements in the stack
	 * 
	 * 
	 * so if I push 4 then 3 then 2 then 12 into the stack. pop should remove and
	 * return 12.
	 * 
	 * You can create test cases to test it similar to how we did yesterday, or test
	 * it manually up to you.
	 * 
	 */

}
