package Operators;

public class example1 
{
	public static void main (String [] args)
	{
		String userId ="akshay";
		String password ="akshay@123";
		
		String user1 ="parth";
		String user1Pass ="parth@123";
		
		String user2 ="jay";
		String user2Pass ="jay@123";
		
		String user3 ="shrisha";
		String user3Pass ="shrisha@123";
		
		String user4 ="akshay";
		String user4Pass ="akshay@123";
		
		System.out.println("User1 match creds :" + !(userId != user1 || password != user1Pass ));
		System.out.println("User2 match creds :" + !(userId != user2 || password != user2Pass ));
		System.out.println("User3 match creds :" + !(userId != user3 || password != user3Pass ));
		System.out.println("User4 match creds :" + !(userId != user4 || password != user4Pass ));
		
	}

}
