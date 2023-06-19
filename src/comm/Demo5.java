
package comm;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int count =0;
		int n =1;
		while(count<num)
		{
			int c=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(n+" ");
				count++;
			}
			n++;
		}
		

	}

}
