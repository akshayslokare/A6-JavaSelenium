package loops;

public class example3 
{
	public static void main(String [] args)
	{
		int num = 13;
		int count = 0;
		
		for(int i=2; i<=num/2;)
		{
			if(num%i == 0);
			{
				count++;
				break;
			}
			
		}
		
		if(count == 0)
			System.out.println(num+" Is Prime Number");
		else
			System.out.println(num+" Is not Prime Number");
	}
}
