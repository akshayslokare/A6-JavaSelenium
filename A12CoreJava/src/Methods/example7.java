package Methods;

public class example7 
{
	public static void test(int balance, int credit, int debit)
	{
		System.out.println("Available Balance : "+balance);
		int bal = credit+balance;
		System.out.println(credit+" Rs. Credited. "+" Available Balance is :"+bal);
		System.out.println(debit+" Rs. Debited. "+" Available Balance is :"+(bal-debit));
		
	}
	public static void main(String [] args)
	{
		test(2000,500,300);
	}

}
