package datastructures;

import java.util.Comparator;

import java.util.PriorityQueue;


class StudentComparator implements Comparator<Student> {

	
	public int compare(Student s1, Student s2) {
		if(s1== null && s2 == null) {
			return 0;
		}else if(s1== null) {
			return 1;
		} else if(s2 == null ) {
			return -1;
		} else if (s1.gpa < s2.gpa)
			return 1;
		else if (s1.gpa > s2.gpa)
			return -1;
		return 0;
	}
}

//
public class BestStudentQ implements IMaxPriorityQueue<Student> {

	
	//TODO: complete this using ArrayList with sorting
	public static void main(String[] args) {

		PriorityQueue<Student> pq = new PriorityQueue<Student>(3, new StudentComparator());

		Student student1 = new Student("Yasir", 3.2);

		pq.add(student1);
		Student student2 = new Student("Safia", 3.6);
		pq.add(student2);
		Student student3 = new Student("Aizah", 4.0);
		pq.add(student3);

		System.out.println("Students served in their priority order");

		while (!pq.isEmpty()) {
			Student s = pq.poll();
			System.out.println(s.getName() + " " + s.getgpa());

		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insert(int priority, Student element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int maxKey() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student remove() {
		// TODO Auto-generated method stub
		return null;
	}
}
