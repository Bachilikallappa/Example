package newpatterns;

public class Demo23 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=5;i++)
		{int c = 0;
			for(int j=1; j<=5;j++)
			{
				if(j%2==0)
				{
				  c++;
				}
				if(c==i)
				{
					System.out.print("*");
				}
				c=0;
			}
			System.out.println();
		}

	}

}
