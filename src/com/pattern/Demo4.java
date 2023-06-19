package com.pattern;

public class Demo4 {
// sum of the Array
	public static void main(String[] args) {


		int [] arr = {10, 20,5,2,3};
		int sum =0;
		for(int i =0; i<=arr.length-1; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}

}
