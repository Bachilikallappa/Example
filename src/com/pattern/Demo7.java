package com.pattern;

import java.util.Arrays;
// Normal Sourting 
public class Demo7 {

	public static void main(String[] args) {

       int [] arr = {10,2,5,51,70,90,3};
		
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
