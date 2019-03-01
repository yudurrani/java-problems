package datastructures;

public class LinkedStack<T> implements Stacks<T>{
	Node<T> top;
	int size;

	@Override
	public void push(T x) {
		// TODO Auto-generated method stub
		top = new Node<T>(x, top);
		size++ ;
	}

	@Override
	public T pop() {
		if (top == null) {
			throw new IndexOutOfBoundsException("Stack is empty");
		}
		// TODO Auto-generated method stub
		T result = top.value;
		top=top.next;
		size -- ;
		return result;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		
		return top.value;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size ;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}
	

}
