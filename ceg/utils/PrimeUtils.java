package ceg.utils;


public class PrimeUtils 
{
	public static void main( String args [] ) 
	{
		is_prime( 10 );
	}
	public static boolean is_prime( int num )
	{		
		if ( num < 2 ) return false;
		
		int num_sqrt = ( int ) Math.ceil( Math.sqrt( num ) );		
		for ( int i = 2; i < num_sqrt; i++ )
		{
			if ( num % i == 0 ) return false;
		}
		return true;
	}
}	
