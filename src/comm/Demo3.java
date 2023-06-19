package comm;

import java.util.Scanner;
// factorial of a Number
public class Demo3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		
		int num = sc.nextInt();
		
		int fat = 1;
		
		for(int i =1; i <=num ; i++)
		{
			fat = fat*i;
		}
            System.out.println(fat);
	}

}
