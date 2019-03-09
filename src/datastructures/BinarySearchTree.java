package datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BinarySearchTree implements List<Integer> {

	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}

	}

	Node root;
	int size;

	@Override
	public boolean add(Integer e) {
		if (root == null) {

			root = new Node(e);

		}

		addElement(root, e);

		return false;
	}

	private void addElement(Node root, Integer e) {
		if (root.value > e) { // Add to the left of root

			if (root.left == null) {
				root.left = new Node(e);
			} else {
				addElement(root.left, e);
			}

		}

		else { // Add to the right of root

			if (root.right == null) {
				root.right = new Node(e);
			} else {
				addElement(root.right, e);
			}
		}
	}

	@Override
	public void add(int index, Integer element) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		root = null;
		size = 0;

	}

	@Override
	public boolean contains(Object o) {
		return contains((Integer) o);
	}

	private boolean contains(Node root, Integer e) {
		if (root == null) {
			return false;
		}

		if (root.value == e) {
			return true;
		}

		if (root.value > e) {
			return contains(root.left, e);
		}

		else {
			return contains(root.right, e);
		}
	}

	private boolean contains(Integer e) {
		Node curr = root;

		while (curr != null) {

			if (curr.value == e) {
				return true;
			}

			else if (curr.value > e) {
				curr = curr.left;
			}

			else {
				curr = curr.right;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
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
		return false;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Integer> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Integer> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer remove(int index) {
		// TODO Auto-generated method stub
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
	public Integer set(int index, Integer element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
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
