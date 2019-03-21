package iti1121Exercise;

import java.util.Iterator;

public class CircularLogIterator {
	int capacity;
	int size;
	int curser;
	String[] forInfo;

	public CircularLogIterator(int maxCapacity) {
		capacity = maxCapacity;
		forInfo = new String[maxCapacity];

	}
	

	
	public class CLogIterator implements Iterator<String> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
