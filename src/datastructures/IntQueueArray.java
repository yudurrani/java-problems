package datastructures;

public class IntQueueArray implements Queue {

	int[] array;

	int n;

	IntQueueArray() {
		array = new int[10];
	}

	@Override
	public void enqueue(int i) {
		array[n] = i;
		n++;

	}

	@Override
	public int dequeue() {
		int tmp = array[0];

		for (int x = 0; x < n; x++) {
			array[x] = array[x + 1];
		}
		n--;
		return tmp;

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public boolean isEmpty() {
  
		return n == 0;
	}

}
