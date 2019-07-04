package datastructures;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import hackerrank.SparseArrays;

public class TestSparseArrays {

	@Test

	public void testSparseArrays() {

		String[] strings = new String[] { "ab", "abc", "ab" };

		String[] queries = new String[] { "ab", "abc", "bc" };
		
		int[] result = SparseArrays.matchingStrings(strings,queries);
		
		assertEquals(2, result[0]);
		assertEquals(1, result[1]);
		assertEquals(0, result[2]);
	}
}