package part2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPrimeNumber {

	@Test
	public void testIsPrimeNumber() {
		
		assertTrue("Should be a prime",PrimeCheck.isPrime(19));
		assertFalse(PrimeCheck.isPrime(20));
		assertFalse("Should not be a prime", PrimeCheck.isPrime(20));


	}
}
