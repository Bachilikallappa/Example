package patterns;

public class Demo1 {

	public static void main(String[] args) {
		int n =5 ;
		int m = 3;
		
		for (int i = 1; i <=n; i++)
		{
			if(i<=n/2)
			{
				for (int j = 1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for (int j =i;j<=n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
