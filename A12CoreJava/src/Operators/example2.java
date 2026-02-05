package Operators;

public class example2 
{
	public static void main(String [] args)
	{
		int sub1 = 45;
		int sub2 = 50;
		int sub3 = 30;
		
		int total1 = sub1+sub2+sub3;
		System.out.println("Student1 Total :" + total1);
		
		double avrg1 = total1/3;
		System.out.println("Average is :" +avrg1);
		System.out.println("Student1 passed : " + (avrg1>=35));
		
		int s1 = 35;
		int s2 = 20;
		int s3 = 10;
		
		int total2 = s1+s2+s3;
		System.out.println("Student2 Total :" + total2);
		
		double avrg2 = total2/3;
		System.out.println("Average is :" +avrg2);
		System.out.println("Student2 passed : " + (avrg2>=35));
		
	}
}
