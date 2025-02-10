import java.util.Scanner;

class MergeSort {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter the size of the array : ");
		int n = s.nextInt();
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("\nElements before sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"\t");
		}
		msort(a,0,n);
		System.out.println("\nElements after sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"\t");
		}
	}
	static void msort(int a[],int low, int high) {
		int mid;
		if(low < high) {
			mid = (low+high)/2;
			msort(a,low,mid-1);
			msort(a,mid,high);
			merge(a,low,mid,high);
		}
	}
	static void merge(int a[],int low,int mid, int high) {
		int i=low,k=low,j=mid+1;
		int b[] = new int[10];
		while(i <= mid && j <= high) 
		{
			if(a[i] <= a[j]) 
			{
				b[k++] = a[i++];
			}
			else 
			{
				b[k++] = a[j++];
			}
		}
		if (i > mid)
    		{
      			while(j<=high)
      			{
        			b[k++]=a[j++];
      			}  
    		}
    		else
    		{
      			while(i<=mid)
      			{
        			b[k++]=a[i++];
      			}
    		}

		for(i=low ; i<=high ; i++) {
			a[i] = b[i];
		}
	}
}
