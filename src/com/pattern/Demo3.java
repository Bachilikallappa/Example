package com.pattern;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = sc.nextInt();
		System.out.println("Ente the Array Value");
		int[] arr = new int[size];

		for (int i = 0; i <= arr.length - 1; i++)
		{
			arr[i] = sc.nextInt();
		}
		int count =0;
		for(int j =0; j<=arr.length-1; j++)
		{
			count++;
			
		}
		System.out.println(Arrays.toString(arr)+" and count is :"+count);

	}

}
