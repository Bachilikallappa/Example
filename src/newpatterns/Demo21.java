package newpatterns;

public class Demo21 {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3 =n1+n2;
		
		//System.out.println(n1+" ");
		//System.out.println(n1+" "+n2);
		
		
		for(int i = 0; i<=5; i++)
		{
			for(int j =0;j<i; j++)
			{
				
				
				System.out.print(n3+" ");
				n3 = n1+n2;
				n1 =n2;
				n2 = n3;
			}
			System.out.println();
		}
	}

}
