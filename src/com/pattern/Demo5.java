package com.pattern;

import java.util.Arrays;

public class Demo5 {
// 
	public static void main(String[] args) {
		
		int [] arr = {10,5,0,3,0,7,11,3,0};
		int count =0;
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==1)
			{
				System.out.print(arr[i]+" ");
				count++;
			}
		}
			System.out.println(" and count of it : "+count);
	}

}
