import java.util.*;
class Bubble
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter the size of the array : ");
		int n = s.nextInt();
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++) 
		{
			a[i] = s.nextInt();
		}
		System.out.println("Before sorting of elements : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int t=0;
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-1-i;j++)
				{
					if(a[j]>a[j+1])
					{
					
						t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
	     				}
		
				}
			}
		System.out.println("After sorting of elements : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}	
