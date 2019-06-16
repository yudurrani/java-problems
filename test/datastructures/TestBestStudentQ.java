package datastructures;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestBestStudentQ {

	@Test
	public void testStudentQ() {
		IMaxPriorityQueue<Student> studentQ = new BestStudentQ();
		
		Student student1 = new Student("Zaid", 3.8);
		studentQ.insert((int)student1.getgpa()*10, student1);
		
		Student student2 = new Student("Zaynab", 4.0);
		studentQ.insert((int)student2.getgpa()*10, student2);
		
		assertEquals(2, studentQ.size());
		assertFalse(studentQ.isEmpty());
		assertEquals(student2, studentQ.max());
		assertEquals((int)student2.getgpa()*10, studentQ.maxKey());
		assertEquals(student2, studentQ.remove());
		
		
		
	}
}
