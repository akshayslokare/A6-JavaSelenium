package Operators;

public class logicalNot 
{
	public static void main(String [] args)
	{
		String dish1 ="pumkin";
		String dish2 ="mashroom";
		
		String D1 ="paneer";
		String D2 ="pumkin";
		String D3 ="momos";
		String D4 ="mashroom";
		
		System.out.println("You can eat Dish1 :" + !( dish1==D1 || dish2 == D1));
		System.out.println("You can eat Dish2 :" + !( dish1==D2 || dish2 == D2));
		System.out.println("You can eat Dish3 :" + !( dish1==D3 || dish2 == D3));
		System.out.println("You can eat Dish4 :" + !( dish1==D4 || dish2 == D4));
		
	}
}
