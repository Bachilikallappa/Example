package comm;

public class Demo7 {

	public static void main(String[] args) {
		
		int num =7;
		int i =1;
       int count =0;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("yes Prime number");
		}
		else
		{
			System.out.println("no prime number");
		}

	}

}
