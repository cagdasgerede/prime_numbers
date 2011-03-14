package ceg.utils.tests;

import java.util.Arrays;

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
		assertTrue( PrimeUtils.is_prime(  PrimeUtils._8_DIGIT_PRIME ) );
	}
	
	public void test_is_prime_upto()
	{
		final int UPTO = 18;
		boolean [] prime = new boolean[ UPTO + 1 ];
		Arrays.fill( prime, false );		
		prime[ 2 ] = true;
		prime[ 3 ] = true;		
		prime[ 5 ] = true;		
		prime[ 7 ] = true;				
		prime[ 11 ] = true;
		prime[ 13 ] = true;
		prime[ 17 ] = true;
		prime[ 18 ] = false;
		assertTrue( Arrays.equals( prime, PrimeUtils.is_prime_up_to_with_naive( UPTO ) ) );
		assertTrue( Arrays.equals( prime, PrimeUtils.is_prime_up_to_with_sieve( UPTO ) ) );
	}
}
