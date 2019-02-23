package datastructures;

public  interface Stacks {
	/**
	 * This will save the integer pass in at the top of the queue
	 * @param i the integer that is saved
	 */
	public void push(int i);
	/**
	 * This will return the integer passed using LIFO, at the top
	 * @return the saved integer is returned
	 */
	public int pop();
	
	/**
	 * This will show the top of the Queue
	 * @return integer top of Queue
	 */
	
	public int peek();
	
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
