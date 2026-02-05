package Arrays;

public class example7 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40};
		int b=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=b;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}


//swapping 1st and last element