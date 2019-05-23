package datastructures;

public class MaxPriorityQueue<E> {

	public class PriorityNode {
		E value;
		int priority;

		PriorityNode(E value, int pr) {
			this.value = value;
			this.priority = pr;
		}
	}

	LinkedList<PriorityNode> list = new LinkedList<PriorityNode>();

	public int size() {

		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void insert(E value, int priority) {

		PriorityNode check = new PriorityNode(value, priority);

		list.add(check);

	}

	public int maxKey() {
		int max = Integer.MIN_VALUE;

		// list.get(index) will return ProviderNode at that position
		// list.size() will return size of list

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).priority > max) {
				max = list.get(i).priority;
			}
		}

		return max;

	}

	public E removeMax() {

		int location = 0;
		int max = maxKey();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).priority == max) {
				location = i;
				break;
			}
		}
		return list.remove(location).value;

	}

}
