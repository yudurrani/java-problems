package datastructures;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestBestStudentQ {

	@Test
	public void testStudentQ() {
		IMaxPriorityQueue<Student> studentQ = new BestStudentQ();
		
		Student student1 = new Student("Zaid", 3.8);
		studentQ.insert(student1);
		
		Student student2 = new Student("Zaynab", 4.0);
		studentQ.insert(student2);
		
		Student student3 = new Student("Shaheera", 3.9);
		studentQ.insert(student3);
		
		Student student4 = new Student("abcd", 3.0);
		studentQ.insert(student4);
		
		assertEquals(4, studentQ.size());
		assertFalse(studentQ.isEmpty());
		assertEquals(student2, studentQ.max());
		assertEquals((int)student2.getgpa()*10, studentQ.maxKey());
		assertEquals(student2, studentQ.remove());
		
		
		
	}
}
