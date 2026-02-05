package Methods;

public class example4 
{
	public static void table(int a)
	{
		for(int b=1;b<=10;b++)
		System.out.println(a+" X "+b +" = "+(a*b));
	}
	public static void main(String [] args)
	{
		System.out.println("Tables :");
		table(4);
		System.out.println();
		table(5);
	}

}
