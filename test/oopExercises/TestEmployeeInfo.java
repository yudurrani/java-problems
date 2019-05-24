package oopExercises;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestEmployeeInfo {
	@Test

	public void testNames() {
		Employee trump = new Employee(001, "Donald", "Trump", 100);

		assertEquals("Donald Trump", trump.getName());

	}

	@Test

	public void testSalary() {
		Employee fahad = new Employee(002, "Fahad", "Bin Salaiman", 100);
		
		assertEquals(1200, fahad.getAnnualSalary());
		assertEquals(110, fahad.raiseSalary(10));
	}

}
