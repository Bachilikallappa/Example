package newpatterns;

public class Demo22 {

	public static void main(String[] args) {
		
		for(int i=0; i<5;i++)
		{
			char x ='A';
			for(int j=0; j<=i; j++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}

	}

}
