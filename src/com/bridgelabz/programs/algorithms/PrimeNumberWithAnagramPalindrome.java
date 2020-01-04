package com.bridgelabz.programs.algorithms;

public class PrimeNumberWithAnagramPalindrome 
{
	public static void anagramCheck ( int number  , int [][]  array ) 
	{
		int count = 0 ;
		int temp = number ;
		int temp1 = number ;
		
		int remind , remind1 ;
		int sum = 0 ;
		int sum1 = 0 ;
		int multi = 1 ;
		while ( temp > 0 )//anagram check count number
		{
		  
		  count++ ;
		  temp = temp / 10 ;
		 }
		
		while ( temp1 > 0 ) //anagram number check
		{
			remind = temp1 % 10 ;
			while ( count > 0 )  
			{
				multi = multi * multi ;
				count-- ;
			}
			sum1 = multi + sum1 ;
			temp1 = temp1 / 10 ;				
		}
		
		
		
		
	}
	public static void palindromeCheck( int number ) 
	{
		int temp2 = number ;
		int remind1 ;
		int sum = 0 ;
		while ( temp2 > 0 ) //palindrome number check
		{
			remind1 = temp2 % 10 ;
			 sum = ( sum * 10 ) + remind1 ;
			 temp2 = temp2 / 10 ;
		}
		
		if ( sum == number ) 
		{
			System.out.println ( "given number is palindrome " + sum ) ;
		}		
	}
	public static void main(String[] args) 
	{
		int number = 1000 ;
		boolean primeFlag = true ;
		System.out.println ( "prime numbers bet." ) ;
		for ( int row = 2 ; row <= number ; row++ ) 
		{	
				for ( int row1 = 2 ; row1 <= row / 2 ; row1++ )  //check number is prime or not loop
				{    
					if ( row % row1 == 0 ) 
					{
						primeFlag = false ;
						break ;
					}
					else 
					{
						 primeFlag = true ;					
					}		
				}
			
				if ( primeFlag == true ) 
				{
					PrimeNumberWithAnagramPalindrome.palindromeCheck(row);
				//	PrimeNumberWithAnagramPalindrome . anagramCheck ( row ) ;
					
				}	
		}		
	}

}
