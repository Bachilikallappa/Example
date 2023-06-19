package com.pattern;

import java.util.Arrays;

public class Demo8 {

	public static void main(String[] args) {
		int [] arr = {10,20,2,8,90,50};
		int size = arr.length;
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr.length-2; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
   for(int k =0; k<=arr.length-1; k++)
   {
	   System.out.print(arr[k]+" ");
   }
   System.out.println("Second Largest number : "+arr[size-2]);
		
	}

}
