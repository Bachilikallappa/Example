package com.pattern;
// *
// **
// ***
// ****
// *****

public class Demo1 {

	public static void main(String[] args) {

		int n =5;
		for(int i =5; i>=-n; i--)
		{
			for(int j=1; j<= Math.abs(i); j++)
			{
				System.out.print("#"+" ");
			}
			for(int k=n; k>=Math.abs(i); k--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		

		
	}

}
