package com.pattern;

public class Demo6 {

	public static void main(String[] args) {


		int [] arr = {2,5,10,51,3,7};
		int max =0;
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]>=max)
			{
				max= arr[i];
			}
		}
		
		System.out.println(max);
	}

}
