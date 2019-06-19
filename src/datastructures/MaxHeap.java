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
		if (currentIndex == 0) {
			return;
		}

		boolean shouldSwap = comparator.compare(getParent(currentIndex), valueList.get(currentIndex)) < 0;
		if (shouldSwap) {
			int parentIndex = getParentIndex(currentIndex);
			swap(parentIndex, currentIndex);

			upHeap(parentIndex);
		}

	}

	private void swap(int index1, int index2) {
		E replaced = valueList.get(index1);
		valueList.set(index1, valueList.get(index2));
		valueList.set(index2, replaced);
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

	/**
	 * element with highest priority
	 * 
	 * @return
	 */
	public E max() {
		// TODO Auto-generated method stub
		if (valueList.isEmpty()) {
			return null;
		} else
			return valueList.get(0);
	}

	/**
	 * remove element with highest priority
	 * 
	 * @return
	 */
	public E remove() {
		// TODO Auto-generated method stub
		if (valueList.isEmpty()) {
			return null;
		}

		E deleted = valueList.get(0);

		int lastIndex = valueList.size() - 1;
		valueList.set(0, valueList.get(lastIndex));
		valueList.remove(lastIndex);

		downHeap(0);
		return deleted;
	}

	private void downHeap(int i) {
		
		if (getLeftChild(i)==null && getRightChild(i)==null) {
			return ;
		}

		boolean isLeftChildGreater = comparator.compare(getLeftChild(i), getRightChild(i)) > 0;

		if (isLeftChildGreater) {
			boolean parentSwap = comparator.compare(getLeftChild(i), valueList.get(i)) > 0;

			if (parentSwap) {
				swap(getLeftChildIndex(i), i);
			}
			downHeap(getLeftChildIndex(i));
		} else {
			boolean parentSwap = comparator.compare(getRightChild(i), valueList.get(i)) > 0;

			if (parentSwap) {
				swap(getRightChildIndex(i), i);
			}
			downHeap(getRightChildIndex(i));
		}
		
	}
}
