package com.bridgelabz.programs.basiccore;

import java.util.Scanner;

public class primeFactor {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scanner =new Scanner(System.in);
		int number=scanner.nextInt();
		int temp=number;
	
		
		for(int i=2;i*i<number;i++) 
		{
			if(temp%i==0) 
			{
				System.out.println(i);
				temp=temp/i;
				i--;
				
			}
			
			
		}
		System.out.println(temp);

	}

}
