package crackingTheCodingInterview;


public class RearrangingNodes {

	public static class linkedListNode {

		public class Node {
			Node next;
			int data;

			public Node(int data) {
				this.data = data;
			}

		}

		Node head;

		public void insertHead(int data) {

			Node saved;

			if (head == null) {
				head = new Node(data);
				return;
			}

			saved = head;

			head = new Node(data);
			head.next = saved;

		}

		public void insert(int data) {

			if (head == null) {
				head = new Node(data);
				return;
			}

			Node current = head;

			while (current.next != null) {
				current = current.next;

			}

			current.next = new Node(data);

		}
		
		public void rearr(Node n, int i) {
			
			while(n.next!= null) {
				if(n.data < i) {
					
				}
			}
		}

		public void show() {

			Node node = head;

			while (node != null) {
				System.out.println(node.data);
				node = node.next;
			}

		}
	}
	
	public static linkedListNode Rearranging(linkedListNode list, int value) {
		// security check
		// check value is positive, list is not null
		
		linkedListNode newList = new linkedListNode();
		
		
		
//		if ( newList.head == null) {
//			newList.insert(i);
//		}
		
		while ( list.head.next != null) {
			
			if ( list.head.data < value) {
				newList.insertHead(list.head.data);
				list.head = list.head.next;
			}
			else if ( list.head.data > value || list.head.data == value) {
				newList.insert(list.head.data);
				list.head = list.head.next;
			}
		}
		
		return newList;
	
		
	}
	
	public static void main(String[] args) {

		linkedListNode list = new linkedListNode();

		list.insert(2);
		list.insert(4);
		list.insert(3);
		list.insert(1);
		list.insert(9);
		list.insert(7);
	
		
		Rearranging(list,1).show();

		
	}

}
