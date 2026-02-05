package Methods;

public class example8 
{
	public static void showbalance(double bal)
	{
		System.out.println("Available balance is : "+bal);
	}
	
	public static double creditbal(double bal, double credit)
	{
		bal = bal+credit;
		System.out.println(credit+" Rs. is Credited");
		return bal;
	}
	
	public static double debitbal(double bal, double debit)
	{
		bal = bal-debit;
		System.out.println(debit+" Rs. is Debited");
		return bal;
	}
	
	public static void main(String [] args)
	{
		double balance = 2000;
		showbalance(balance);
		
		double credit = 500;
		balance = creditbal(balance,500);
		showbalance(balance);
		
		double debit = 200;
		balance = debitbal(balance,200);
		showbalance(balance);
	}
}
