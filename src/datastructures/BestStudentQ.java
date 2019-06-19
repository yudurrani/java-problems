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


public class BestStudentQ implements IMaxPriorityQueue<Student> {

	
	MaxHeap<Student> students;
	
	public BestStudentQ( ) {
		Comparator<Student> studentComparator = new StudentComparator();
		this.students = new MaxHeap<Student>(studentComparator);
	}
	

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		return students.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return students.size()==0;
	}

	@Override
	public void insert(Student element) {
		// TODO Auto-generated method stub
		students.add(element);
	}

	@Override
	public Student max() {
		// TODO Auto-generated method stub
		// without removing, returns top student
		return students.max();
	}

	@Override
	public int maxKey() {
		// TODO Auto-generated method stub
		return (int) (students.max().gpa*10.0);
	}

	@Override
	public Student remove() {
		// TODO Auto-generated method stub
		return students.remove();
	}
}

