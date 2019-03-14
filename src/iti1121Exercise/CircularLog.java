package iti1121Exercise;

import datastructures.Queue;

public class CircularLog implements Queue{
	
	int[] array;

	int total;

	CircularLog() {
	 array = new int[4];
	}

	@Override
	public void enqueue(int i) {
		
		if ( array.length == 4 ) {
			
			while ( array[3] == array[2])
			
			for (int x=0; x<3 ; x++) {
				array[x]= array[x+1];
			}
			array[3] = i ;
		}
		
		else {
		array[total] = i;
		total++;
		}
		
		
	}
	public int dequeue() {
		int tmp = array[0];

		for (int x = 0; x < total; x++) {
			array[x] = array[x + 1];
		}
		total--;
		return tmp;

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public boolean isEmpty() {

		return total == 0;
	}

}
