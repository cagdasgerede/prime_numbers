package ceg.utils;

import java.util.Arrays;


public class PrimeUtils 
{
	public static final int _8_DIGIT_PRIME = 27644437;
	public static final int _7_DIGIT_PRIME =  1046527;
	public static final int _6_DIGIT_PRIME = 106033;
	
	public static void main( String args [] ) 
	{
		long start = System.currentTimeMillis();
		for ( int i = 0; i < 10000; i++ ) is_prime( _8_DIGIT_PRIME );
		long end = System.currentTimeMillis();
		System.out.println( "Time: " + (end - start) );
		// 106 - 1 unit
		
		start = System.currentTimeMillis();
		for ( int i = 0; i < 10; i++ ) is_prime_bad_performance( _8_DIGIT_PRIME );
		end = System.currentTimeMillis();
		System.out.println( "Time: " + (end - start) );
		// 995 - 10,000 units
		
		start = System.currentTimeMillis();
		for ( int i = 0; i < 10; i++ ) is_prime_up_to_with_sieve( _7_DIGIT_PRIME );
		end = System.currentTimeMillis();
		System.out.println( "Time: " + (end - start) );
		// 48 - 1 unit
		
		start = System.currentTimeMillis();
		for ( int i = 0; i < 10; i++ ) is_prime_up_to_with_naive( _7_DIGIT_PRIME );
		end = System.currentTimeMillis();
		System.out.println( "Time: " + (end - start) );
		// 1601 - 1,600 unit
		
		
	}
				
	public static boolean is_prime( int num )
	{		
		if ( num < 2 ) return false;
		if ( num == 2 ) return true;
		if ( num % 2 == 0 ) return false;
		
		int num_sqrt = ( int ) Math.ceil( Math.sqrt( num ) );		
		for ( int i = 3; i <= num_sqrt; i += 2 )
		{
			if ( num % i == 0 ) return false;
		}
		return true;
	}
	
	public static boolean is_prime_bad_performance( int num )
	{
		for ( int i = 2; i < num; i++ )
		{
			if ( num % i == 0 ) return false;
		}
		return true;
	}
	
	public static boolean [] is_prime_up_to_with_naive( int num )
	{
		boolean [] prime = new boolean[ num + 1 ];
		Arrays.fill( prime, false );
		prime[ 2 ] = true;
		
		for ( int i = 3; i <= num; i += 2 )
		{
			if ( is_prime( i ) ) prime[ i ] = true;
		}
		return prime;
	}
	
	public static boolean [] is_prime_up_to_with_sieve( int num ) 
	{
		boolean [] prime = new boolean[ num + 1 ];
		Arrays.fill( prime, true );
		prime[ 0 ] = false;
		prime[ 1 ] = false;
		int num_sqrt = ( int ) Math.ceil( Math.sqrt( num ) );
		
		for ( int i = 2; i <= num_sqrt; i++ )
		{
			if ( prime[ i ] )
				for ( int j = i * i; j <= num; j += i )
					prime[ j ] = false;
		}
		return prime;
	}
}	








