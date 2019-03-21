package datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

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

		} else {
			addElement(root, e);
		}
		size++;
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
		throw new UnsupportedOperationException("no index in BST");
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

	public class InOrderIterator implements Iterator<Integer> {

		Stack<Node> stack;

		public InOrderIterator() {
			stack = new Stack<Node>();
			Node curr = root;
			
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;

			}

		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return !(stack.empty());
		}

		@Override
		public Integer next() {
			Node out = stack.pop();
			if (out.right != null) {
				Node curr = out.right;
				while (curr != null) {
					stack.push(curr);
					curr = curr.left;
				}
			
			}
			return out.value;
		}

	}

	@Override
	public Iterator<Integer> iterator() {
		// In order iterator
		return new InOrderIterator();
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
		// preCondition

		if (o == null) {
			throw new IllegalArgumentException("null");
		}

		if (root == null) {
			throw new NoSuchElementException();
		}

		return remove((Integer) o);
	}

	private boolean remove(Node root, Integer e) {

		// special case
		if (root.value == 0) {
			root = removeTopMost(root);
		}

		return false;
	}

	private Node removeTopMost(Node current) {
		Node top;
		if (current.left == null) {
			top = current.right;
		} else if (current.right == null) {
			top = current.left;
		} else {
			current.value = getLeftMost(current.right);
			current.right = removeLeftMost(current.right);
			top = current;
		}
		return top;

	}

	private Integer getLeftMost(Node current) {
		if (current == null) {
			throw new IllegalArgumentException("null");
		}
		if (current.left == null) {
			return current.value;
		}
		return getLeftMost(current.left);
	}

	private Node removeLeftMost(Node current) {
		if (current.left == null) {
			return current.right;
		}
		return current;
	}

	public void printInOrder() {
		// Left, parent, right
		printInOrder(root);

	}

	private void printInOrder(Node root) {

		if (root == null) {
			return;
		}

		printInOrder(root.left);

		System.out.println(root.value);

		printInOrder(root.right);

	}

	public void printPreOrder() {
		// Parent, Left, Right
		printPreOrder(root);

	}

	private void printPreOrder(Node root) {

		if (root == null) {
			return;
		}

		System.out.println(root.value);

		printPreOrder(root.left);

		printPreOrder(root.right);

	}

	public void printPostOrder() {
		// Left right parent

	}

	@Override
	public Integer remove(int number) {

		if (root == null || size == 0 || !contains(number)) {
			System.out.print(" nothing in the root");

		}

		else if (root.value == number && size == 1) {

			root = null;
		}

		else {
			Node curr = root;
			Node parent = null;

			while (curr.value != number) {
				parent = curr;

				if (curr.value > number) {
					curr = curr.left;
				} else {
					curr = curr.right;
				}
			}

			// curr points to the node that needs to be removed.

			if (curr.left == null && curr.right == null) {
				// this curr is the leaf node

				if (parent.left == curr) {
					parent.left = null;
				} else
					parent.right = null;
			}

			else if (curr.left == null) {
				// current only have the right sub tree.
				if (parent.left == curr) {
					parent.left = curr.right;
				} else
					parent.right = curr.right;
			}

			else if (curr.right == null) {
				// current only have the left sub tree.
				if (parent.left == curr) {
					parent.left = curr.left;
				} else
					parent.right = curr.left;
			}

			else {
				// current have a full sub tree

				Node leftMost = curr.right;
				Node leftParent = curr;
				while (leftMost.left != null) {
					leftParent = leftMost;
					leftMost = leftMost.left;

				}
				// i have the left most value of the right sub tree.

				if (leftMost.right != null) {
					// we have a right sub tree.
					leftParent.left = leftMost.right;
				} else {
					leftParent.left = null;
				}

				curr.value = leftMost.value;
			}

		}
		size--;
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
