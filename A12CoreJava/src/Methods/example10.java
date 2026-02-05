package Methods;

public class example10 
{
	public static String even(int num)
	{
		if(num%2==0)
		
			return num+" Even";
	    else
	    	return num+" Odd";
			
	}
	public static void main(String [] args)
	{
		System.out.println("Given number is "+even(13));
	}
}
