package iti1121Exercise;

import java.util.Iterator;

import datastructures.BinarySearchTree.InOrderIterator;



public class CircularLog {

	int capacity;
	int size;
	int curser;
	String[] forInfo;

	public CircularLog(int maxCapacity) {
		capacity = maxCapacity;
		forInfo = new String[maxCapacity];

	}

	public void log(String info) {

		if (curser == capacity) {
			curser = 0;
		}
		forInfo[curser] = info;
		curser++;
		size++;

	}

	public int size() {
		if (size < capacity) {
			return size;
		} else
			return capacity;
	}

	public String get(int x) {

		if (size <= capacity) {
			return forInfo[x];
		} else
			return forInfo[(curser + x) % capacity];

	}

	public class CircularLogIterator implements Iterator<String> {
		
	


		int c = 0;

		@Override
		public boolean hasNext() {
			return c < capacity;
		}

		@Override
		public String next() {

			return get(c++);
		}
	}
	public Iterator<String> iterator() {
		
		return new CircularLogIterator();
	}
	
	


}
