package comm;

import java.util.Scanner;

public class Demo1 {
  // Sum of  in a number; 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();

		int sum = 0;

		int temp = 0;

		while (num > 5) {
			temp = num % 10;
			num = num / 10;
			sum = sum + temp;
		}

		System.out.println(sum);

	}

}
