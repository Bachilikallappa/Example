package newpatterns;

public class Demo14 {

public static void main(String[] args) {
	
	char x = 'A';
		
		for(char i='A'; i<='E'; i++)
		{
			for(char j='A'; j<='E'; j++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	
	}
}
