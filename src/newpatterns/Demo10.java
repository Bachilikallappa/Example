package newpatterns;

public class Demo10 {

	public static void main(String[] args) {
		
		int x = 1;
		for(int i =1; i<=5;i++)
		{
			x=i;
			for(int j = 1; j<=5; j++)
			{
				System.out.print(x+" ");
				x=x+5;
			}
			
			System.out.println();
		}
	}
}
