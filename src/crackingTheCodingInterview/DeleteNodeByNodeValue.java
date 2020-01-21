package crackingTheCodingInterview;

public class DeleteNodeByNodeValue {

	public static class linkedList {

		public class Node {
			int dataa;
			Node next;

			public Node(int data) {
				dataa = data;
			}
		}

		int data;
		Node head;

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

		public boolean delete(int data) {

			if (head == null || head.next == null) {
				return false;
			}

			Node temp = head;

			while (temp.next.dataa != data) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			return true;
		}

		public void show() {

			Node node = head;

			while (node != null) {
				System.out.println(node.dataa);
				node = node.next;
			}

		}
	}

	public static void main(String[] args) {

		linkedList list = new linkedList();

		list.insert(2);
		list.insert(4);
		list.insert(3);
		list.show();
		list.delete(4);
		list.show();
//		list.insert(1);
//		list.insert(9);
//		list.insert(7);

	}

}
