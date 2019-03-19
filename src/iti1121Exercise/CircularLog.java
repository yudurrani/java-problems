package iti1121Exercise;

public class CircularLog {

	int capacity;
	int size;
	int curser;
	String[] forInfo;

	CircularLog(int maxCapacity) {
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

		if (size < capacity) {
			return forInfo[x];
		} else
			return forInfo[(curser+x+1)%capacity];


	}

}
