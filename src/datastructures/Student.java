package datastructures;

public class Student {
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Student[name=%s, gpa=%s]", name, gpa);
	}
}
