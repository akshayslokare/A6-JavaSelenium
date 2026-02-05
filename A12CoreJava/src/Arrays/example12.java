package Arrays;

public class example12

{
	static int i = first();
	
	static 
	{
		System.out.println("Static 1");	
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		System.out.println();
		System.out.println("Main End");
	}
	
	public static int first()
	{
		System.out.println("First Start");
		System.out.println(i);
		System.out.println("First End");
		return 10;
	}
}
