package crackingTheCodingInterview;

public class FindingKthFromEnd {

	public static class linkedList {

		public class Node {
			Node next;
			int data;

			public Node(int data) {
				this.data = data;
			}

		}

		Node head;
		int linkedListSize;

		public void insert(int data) {

			int size = 2;

			if (head == null) {
				head = new Node(data);
				return;
			}

			Node current = head;

			while (current.next != null) {
				current = current.next;
				size++;
			}

			current.next = new Node(data);
			linkedListSize = size;
		}

		public int next(int number) {

			Node node = head;

			for (int i = 0; i < number-1; i++) {
				node = node.next;
			}

			return node.data;

		}

	}

	public static int getKthFromLast(linkedList list, int position) {

		int ans = list.linkedListSize - position;

		int data = 0;

		data = list.next(ans);
		

		System.out.println(data);
		return data;
	}

	public static void main(String[] args) {

		linkedList list = new linkedList();

		list.insert(2);
		list.insert(4);
		list.insert(3);
		list.insert(1);
		list.insert(9);
		list.insert(7);

		getKthFromLast(list, 2);
	}
}
