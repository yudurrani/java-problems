package datastructures;

import java.util.ArrayList;
import java.util.Comparator;

public class MaxHeap<E> {

	Comparator<E> comparator;
	ArrayList<E> valueList;

	public MaxHeap(Comparator<E> comparator) {
		this.comparator = comparator;
		valueList = new ArrayList<E>();
	}

	public int size() {
		return valueList.size();
	}

	public boolean isEmpty() {
		return valueList.isEmpty();
	}

	public void add(E element) {
		// TODO Auto-generated method stub
		valueList.add(element);
		if (size() == 1) {
			return;// Don't need to do anything
		}

		// TODO: up heap on last element

		// value got inserted at the end
		int valueIndex = valueList.size() - 1;
		upHeap(valueIndex);

	}

	/**
	 * 
	 * @param currentIndex, index of current node to compare
	 */
	private void upHeap(int currentIndex) {
		
		

	}

	private E getParent(int currentIndex) {
		int parentIndex = (currentIndex + 1) / 2;
		return valueList.get(parentIndex);
	}

	private int getParentIndex(int currentIndex) {
		return (currentIndex + 1) / 2;
	}

	private E getRightChild(int currentIndex) {
		int rightChild = (2 * (currentIndex + 1)) + 1;
		return valueList.get(rightChild);
	}

	private int getRightChildIndex(int currentIndex) {
		return (2 * (currentIndex + 1)) + 1;

	}

	private E getLeftChild(int currentIndex) {
		int leftChild = 2 * (currentIndex + 1);
		return valueList.get(leftChild);
	}

	private int getLeftChildIndex(int currentIndex) {
		return 2 * (currentIndex + 1);

	}

	public E max() {
		// TODO Auto-generated method stub
		return null;
	}

	public int maxKey() {
		// TODO Auto-generated method stub
		return 0;
	}

	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
