package Methods;

public class example11 
{
	public static String test(int num)
	{
		if(num>0)
		return num+" is Positive";
		else
		return num+" is Negative";
		
	}
	public static void main(String [] args)
	{
		System.out.println(test(-5));
		System.out.println(test(20));
	}
}
