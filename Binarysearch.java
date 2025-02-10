import java.util.Scanner;

class Binarysearch
 {
	public static void main(String arg[]) 
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
		System.out.println("Elements of the array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		int low=0, high=n-1,index=0;
		System.out.println("\nEnter the value to be searched : ");
		int k = s.nextInt();
		while(low <= high)
		{
			int mid = (low+high)/2;
			if(k > a[mid])
		 	{
				low = mid+1;
			}
			else if(k == a[mid]) {
				index = 1;
				break;
			}
			else 
			{
				high = mid-1;
			}
		}
		if(index==1) 
		{
			System.out.println("Element found");
		}
		else 
		{
			System.out.println("Element not found");
		}	
		
	}
}
