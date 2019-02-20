package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

import sortInterface.Room;

public class IntQueueArrayList implements Queue {
	
	
	ArrayList<Integer> list;
	
	IntQueueArrayList(){
		
		list=new ArrayList<Integer>(); 
	}
	
	@Override
	public void enqueue(int i) {
		list.add(i);	
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		return list.remove(0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.size() == 0;
		
	}

}
