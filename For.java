import java.util.*;
class For
{
	public static void main(String args[])
	{
		int a[],n;
		System.out.println("Enter  the size of array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elements are:");
		for(int x:a)
		{
		System.out.println(x);
		}
	}
}