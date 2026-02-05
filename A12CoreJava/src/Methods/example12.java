package Methods;

public class example12 
{
	public static boolean test(int num)
	{
		int org = num;
		int rev = 0;
		
		while(num>0)
		{
			int digit = num%10;
			rev = rev*10 +digit;
			num=num/10;
		}
		
		return org ==rev;
		
	}
	public static void main(String [] args)
	{
		int num = 12;
		
		if(test(num))
		{
			System.out.println(num+" is Palindrome");
		}
		else
		{
			System.out.println(num+" is not Palindrome");
		}
	}

}
