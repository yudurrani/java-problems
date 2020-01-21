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

		public void insertHead(int data) {
			
			Node saved;
			
			if ( head == null) {
				head = new Node(data);
				return;
			}
			
			saved = head;
			
			head = new Node(data);
			head.next = saved;
			
			
			
			
		}
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
		
		public void show() {
			
			Node node = head;
			
			while( node  != null) {
				System.out.println(node.data);
				node = node.next;
			}

		}
		
	}

	public static int getKthFromLast(linkedList list, int position) {

		int ans = list.linkedListSize - position;

		int data = 0;

		data = list.next(ans);
		

		System.out.println(data);
		return data;
	}
	
	// solution from book
//	 public static int nthToLast(linkedList head, int k) {
//		if (head == null) {
//		return 0;
//		}
//		
//		int i = nthToLast(head.next, k) + 1;
//		if (i == k) {
//		System.out.println(head.data);
//		}
//		return i;
//		}
	
	

	public static void main(String[] args) {

		linkedList list = new linkedList();

		list.insert(2);
		list.insertHead(4);
		list.insertHead(3);
		list.show();
//		list.insert(1);
//		list.insert(9);
//		list.insert(7);

		System.out.println(list.next(2));
	}
}
