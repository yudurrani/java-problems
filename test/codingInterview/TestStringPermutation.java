package codingInterview;
import static org.junit.Assert.assertFalse;


import org.junit.jupiter.api.Test;

import crackingTheCodingInterview.StringPermutation;

public class TestStringPermutation {
	
	@Test
	
	public void testPermutation() {
		
	
		 
		boolean thirdTest = StringPermutation.checkPermu("this", "it");
		boolean fourthTest = StringPermutation.checkPermu("th", "shit");
		boolean fifthTest = StringPermutation.checkPermu("12", "12");
		boolean sixthTest = StringPermutation.checkPermu("cab", "abc");
		boolean seventhTest = StringPermutation.checkPermu("ybab", "baby");
		boolean eightthTest = StringPermutation.checkPermu("sdf", "12sfdf");
		
		
		
		assertTrue( StringPermutation.checkPermu("this", "shit"));
		assertFalse( StringPermutation.checkPermu("this", "itip"));
		assertFalse ( thirdTest);
		assertFalse ( fourthTest);
		assertFalse ( fifthTest);
		assertTrue( sixthTest);
		assertTrue( seventhTest);
		assertFalse( eightthTest);
		
	}

	private void assertTrue(boolean firstTest) {
		// TODO Auto-generated method stub
		
	}
	

}
