package Operators;

public class example3 
{
	public static void main(String []args)
	{
		double prod1 =1599.99;
		double prod2 =99.99;
		double prod3 =1999.99;
		double prod4 =9.99;
		boolean isPrime = true;
		
		double cust1 =prod1+prod3;
		System.out.println("Customer1 bill :" + cust1);
		System.out.println("Customer1 prime :" + !(isPrime));
		System.out.println("Eligible for discount :" + (cust1>=3000 || (isPrime)));
		
		double cust2 =prod2+prod4;
		System.out.println("Customer2 bill :" + cust2);
		System.out.println("Customer2 prime :" + !(isPrime));
		System.out.println("Eligible for discount :" + (cust2>=3000 || !(isPrime)));
	}
}
