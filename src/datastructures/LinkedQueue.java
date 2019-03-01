package datastructures;

public class LinkedQueue implements Queue {

	int size;
	Node<Integer> head;
	
	@Override
	public void enqueue(int i) {
		head= new Node<Integer>(i,head);
		size ++;

		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int dequeue() {
		if (head == null) {
			return 0;
		}
		
		if ( size == 1) {
			int x = head.value;
			
			head = null;
			size --;
			
			return x;
			
		}
		Node<Integer> curr = head;
		
		for(int x=0; x<size; x++) {
			
			
			if ( curr.next.next == null) {
			 Node<Integer> last = curr.next;
			 curr.next = null;
			 size --;
			  return last.value;
			  
				
			}
			
		}
		
		
		
		return 0 ;
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
