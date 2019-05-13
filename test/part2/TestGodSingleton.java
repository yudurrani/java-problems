package part2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import datastructures.God;

public class TestGodSingleton {
	@Test
	public void testSingleton() {
		
		assertTrue("Should be singleton, there can only be one God", God.findGod() == God.findGod());

	}
}
