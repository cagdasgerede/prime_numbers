package ceg.utils.tests;

import junit.framework.TestCase;
import ceg.utils.PrimeUtils;


public class TestPrimeUtils extends TestCase {

	public void test_is_prime()
	{
		assertFalse( PrimeUtils.is_prime( 14 ) );
		assertTrue(  PrimeUtils.is_prime( 13 ) );
		assertTrue(  PrimeUtils.is_prime( 2 ) );
		assertTrue(  PrimeUtils.is_prime( 3 ) );
		assertTrue(  PrimeUtils.is_prime( 7 ) );
		assertFalse(  PrimeUtils.is_prime( 1 ) );
		assertFalse(  PrimeUtils.is_prime( 0 ) );
		assertFalse(  PrimeUtils.is_prime( -11 ) );
	}
}
