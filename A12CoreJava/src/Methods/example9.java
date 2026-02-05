//WAJP design a method which can accept a number and return its char value.

package Methods;

public class example9 
{
	public static char asccii(int n)
	{ 	
		char ch =(char)n;
		System.out.println("The char value of "+n+" = "+ch);
		return(ch);
		
		//return(char)n;
	}
	public static void main (String [] args)
	{
		asccii(65);
		asccii(97);
	}
}

