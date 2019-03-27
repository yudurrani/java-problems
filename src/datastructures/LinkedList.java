package datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

	Node<E> head;
	Node<E> tail;
	int size;
	int a;
	String b;

	@Override
	public boolean add(E e) {

		if (size == 0) {
			head = new Node<E>(e);
			tail = head;
			size++;
			return true;
		}

		Node<E> temp = new Node<E>(e);
		tail.next = temp;
		temp.prev = tail;
		tail = temp;
		size++;

		return true;
	}

	@Override
	public void add(int index, E element) {

		Node<E> curr = head;
		if (index >= size) {
			add(element);
		}

		for (int x = 0; x < size; x++) {

			if (x == index) {

				// we have reached a point where we want to add the new node

				Node<E> temp = new Node<E>(element);

				temp.next = curr;

				temp.prev = curr.prev;
				curr.prev = temp;
				if (temp.prev != null) {

					temp.prev.next = temp;
				} else {
					head = temp;
				}
				size++;
				return;
			}

			curr = curr.next;

		}

		// TODO Auto-generated method stub

	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

		size = 0;
		head = null;
		tail = null;

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub

		Node<E> curr = head;

		for (int x = 0; x < size; x++) {

			if (x == index) {
				return curr.value;
			}

			curr = curr.next;

		}

		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {
			
			Node<E> curr = head;
			@Override
			public boolean hasNext() {
				return curr != null;
			}

			@Override
			public E next() {
				E result = curr.value;
				curr = curr.next;
				return result;
			}
			
		};
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub

		Node<E> curr = head;

		for (int x = 0; x < size; x++) {

			if (x == index) {
				// we are at the point where we have to remove the index
				E result = curr.value;

				if (x == 0) {
					head = curr.next;
					head.prev = null;
				} else {
					curr.prev.next = curr.next;

					if (curr.next != null) {
						curr.next.prev = curr.prev;
					} else
						tail = curr.prev;
				}
				size--;
				return result;

			}

			curr = curr.next;

		}
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
