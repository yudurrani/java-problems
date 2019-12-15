package crackingTheCodingInterview;
import java.util.*;


public class LinkedListPractice {
	public static void main(String args[]) {
		// linked list declaration
		
		// linked lists can be used in stacks and queues
		
		LinkedList<String> myLinkedList = new LinkedList<String>();
		
		// adding string elements into link list
		
		myLinkedList.add("I have to finish");
		myLinkedList.add("DataStructures");
		myLinkedList.add("today");
		
		// checking the print option:
		
		System.out.println("Things to do Today" + myLinkedList);
		
		// adding new line in the beginning
		
		myLinkedList.addFirst(" Do ");
		myLinkedList.addLast(" ? ");
		
		// checking the inputs again:
		
		System.out.println("Things to do Today" + myLinkedList);
		
		myLinkedList.add(3, "--ME--");
		
		myLinkedList.removeLast();
		
		System.out.println("Things to do Today" + myLinkedList);
		
		
		// starting stacks
		
		Stack<String> myStack = new Stack<String>();
		
		// adding strings to stack
		
		myStack.push("this is");
		myStack.push("stack");
		myStack.push("implementation");
		
		System.out.println("Stacks: " + myStack);
		
		System.out.println(myStack.peek());
		
		System.out.println( myStack.remove("stack"));
		
		myStack.pop();
		
		System.out.println("Stacks: " + myStack);
		
		
		
		// starting queues
		
		
		Queue<String> myQue = new LinkedList<String>();
		
		// adding strings to Queue
		
				myQue.add("this is");
				myStack.push("Queue");
				myStack.push("implementation");
				
				System.out.println("Stacks: " + myStack);
				
				System.out.println(myStack.peek());
				
				System.out.println( myStack.remove("stack"));
				
				myStack.pop();
				
				System.out.println("Stacks: " + myStack);
		
		
		
		
	}
	

}
