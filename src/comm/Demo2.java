package comm;

import java.util.Scanner;
// prime number
public class Demo2 {
	
	public static void check(int num)
	{
		int count =0;
		for(int i = 1; i<=num; i++ )
		{
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) 
			System.out.println("Prime");
		else
			System.out.println("mot a prime"); 
	    
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		check(num);
	}
}
