package datastructures;

public class LinkedQueueHeadTail implements Queue {
	
	int size;
	Node<Integer> head;
	Node<Integer> tail;

	public void enqueue(int i) {
	
		if (size == 0) {
			head = new Node<Integer>(i, null);
			tail = head;
			size ++ ;
			return;
		}
		
		Node<Integer> temp= new Node<Integer>(i, null);
		
		tail.next = temp;
		
		tail = temp;
		
		size++;
		
		
		
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		
		if (head == null) {
			throw new IndexOutOfBoundsException();

		}
		
		int result = head.value;
		
		size -- ;
		
		head= head.next;
		
		return result;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

}
