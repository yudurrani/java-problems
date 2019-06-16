package datastructures;

public interface IMaxPriorityQueue<E> {
	
	int size();
	boolean isEmpty();
	void insert(int priority, E element);
	E max();
	int maxKey();
	E remove();

}
