package comm;
// Fibanaci
public class Demo4 {

	public static void main(String[] args) {
		
		int num = 10;
		int n1 =0;
		int n2= 1;
		int n3 = 0;
		System.out.print(n3+" " );
		for(int i = 1; i <= num; i++)
		{
			n3 =n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		
		}

	}

}
