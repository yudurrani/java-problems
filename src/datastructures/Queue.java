package datastructures;

public interface Queue {
	/**
	 * This will save the integer pass in at the back of the queue
	 * @param i the integer that is saved
	 */
	public void enqueue(int i);
	/**
	 * This will return the integer passed using FIFO
	 * @return the saved integer is returned
	 */
	public int dequeue();
	
	/**
	 * This will give the size of Queue
	 * @return integer size of Queue
	 */
	public int size();
	
	/**
	 * Will tell us if the Queue have any value or not
	 * @return the boolean stating if its empty or not 
	 */
	public boolean isEmpty();

}
