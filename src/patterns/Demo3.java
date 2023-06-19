package patterns;

public class Demo3 {

	public static void main(String[] args) {
		int n = 3;
		int d=1;
		for(int i =3; i>=1; i--)
		{
			int c=1;
			for(int j =1; j<=5;j++)
			{
				if(j>=i && c<=d) {
					System.out.print("*");
					c++;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			d=d+2;
		}

	}

}
