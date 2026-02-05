package Methods;

public class example5 
{
	public static void num(int n)
	{
		if(n<0)
		{
			System.out.println(n+" is negative number");
		}
		else if(n>0)
		{
			System.out.println(n+" is positive number");
		}
		else if(n == 0)
		System.out.println(n+" is zero");
		
	}
	public static void main(String [] args)
	{
		num(-4);
	}
}
