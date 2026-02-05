package Methods;

public class example6 
{
	public static void test(int num)
	{
		char ch =(char)num;
		System.out.println("Character value of "+num+" = "+ch);
	}
	public static void main(String [] args)
	{
		test(65);
		test(66);
		test(97);
		test(98);
	}
}
