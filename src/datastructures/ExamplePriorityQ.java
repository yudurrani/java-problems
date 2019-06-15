package datastructures;

import java.util.Comparator;
import java.util.Scanner;
//import java.util.PriorityQueue;

public class ExamplePriorityQ<E> {
	
	public class PriorityNode{
		E value;
		int prority;
		
		PriorityNode(E value, int pri){
			this.value = value;
			this.prority = pri;
		}
	}
	
	LinkedList<PriorityNode> list = new LinkedList<PriorityNode>();
	
}

//	
//	class Student{
//		public String name;
//		public double gpa;
//		
//		public Student(String name, double gpa) {
//			this.name = name;
//			this.gpa = gpa;
//		}
//		
//		public String getName() {
//			return name;
//		}
//		
//		public double get  
//	}
//
//	
//
//class StudentComparator implements Comparator<Student> {
//
//	// Overriding compare()method of Comparator
//	// for descending order of cgpa
//	public int compare(Student s1, Student s2) {
//		if (s1.cgpa < s2.cgpa)
//			return 1;
//		else if (s1.cgpa > s2.cgpa)
//			return -1;
//		return 0;
//	}
//}
//
//class Student {
//	public String name;
//	public double cgpa;
//
//	// A parameterized student constructor
//	public Student(String name, double cgpa) {
//
//		this.name = name;
//		this.cgpa = cgpa;
//	}
//
//	public String getName() {
//		return name;
//	}
//}
//
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//
//	PriorityQueue<Student> pq = new PriorityQueue<Student>(5, new StudentComparator());
//
//	// Invoking a parameterized Student constructor with
//	// name and cgpa as the elements of queue
//	Student student1 = new Student("Yasir", 3.2);
//
//	// Adding a student object containing fields
//	// name and cgpa to priority queue
//	pq.add(student1);
//	Student student2 = new Student("Safia", 3.6);
//	pq.add(student2);
//	Student student3 = new Student("Aizah", 4.0);
//	pq.add(student3);
//
//	// Printing names of students in priority order,poll()
//	// method is used to access the head element of queue
//	System.out.println("Students served in their priority order");
//
//	while (!pq.isEmpty()) {
//		System.out.println(pq.poll().getName());
//	}
//}
//}
