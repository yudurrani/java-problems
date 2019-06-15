package datastructures;

import java.util.Comparator;

import java.util.PriorityQueue;
//
public class ExamplePriorityQ<E> {
//	
//	public class PriorityNode{
//		E value;
//		int prority;
//		
//		PriorityNode(E value, int pri){
//			this.value = value;
//			this.prority = pri;
//		}
//	}
//	
//	PriorityQueue<PriorityNode> list = new PriorityQueue<PriorityNode>();
//	
//}

	
	class Student{
		public String name;
		public double gpa;
		
		public Student(String name, double gpa) {
			this.name = name;
			this.gpa = gpa;
		}
		
		public String getName() {
			return name;
		}
		
		public double getgpa() {
			return gpa;
		}
	}

	

class StudentComparator implements Comparator<Student> {

	// Overriding compare()method of Comparator
	// for descending order of cgpa
	public int compare(Student s1, Student s2) {
		if (s1.gpa < s2.gpa)
			return 1;
		else if (s1.gpa > s2.gpa)
			return -1;
		return 0;
	}
}


public void main(String[] args) {


	PriorityQueue<Student> pq = new PriorityQueue<Student>(5, new StudentComparator());

	
	Student student1 = new Student("Yasir", 3.2);

	
	pq.add(student1);
	Student student2 = new Student("Safia", 3.6);
	pq.add(student2);
	Student student3 = new Student("Aizah", 4.0);
	pq.add(student3);

	System.out.println("Students served in their priority order");

	while (!pq.isEmpty()) {
		System.out.println(pq.poll().getName()  + " " + pq.poll().getgpa());
	
	}
}
}
