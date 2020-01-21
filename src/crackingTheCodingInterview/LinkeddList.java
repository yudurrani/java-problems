//package crackingTheCodingInterview;
//
//
//
//public class LinkeddList {
//
//	Node head ;
//	
//	public void insert( int number) {
//		Node node = new Node();
//		
//		node.data = number;
//		
//		if (head == null) {
//			head = node;
//		}
//		
//		else {
//			Node n = head;
//			
//			while( n.next != null) {
//				n = n.next;
//			}
//			
//			n.next = node ;
//		}
//	}
//	
//	public void show() {
//		
//		Node node = head;
//		
//		while( node  != null) {
//			System.out.println(node.data);
//			node = node.next;
//		}
//	}
//}
