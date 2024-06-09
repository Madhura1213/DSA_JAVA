package demo.heapsort;

import java.util.Scanner;

public class HeapSort {

	
	public static int[] acceptData(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter num:");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}

	public static void heapsort(int[] arr)
	{
		int length = arr.length;
		
		for(int i = length/2-1;i>=0;i--)
		{
			buildheap(arr,length,i);
		}
		int i;
		for( i=length-1;i>=0;i--)
		{
			//swap 
			int temp = arr[0];
			arr[0]= arr[i];
			arr[i]= temp;
			buildheap(arr,i,0);
		}
		
	}
	
	private static void buildheap(int[] arr, int last, int root) {
	int largestroot= root ;
	int left= 2*root+1;
	int right = 2*root+2;
	
	//max heap conditions
	if(left<last && arr[left]> arr[largestroot])
		largestroot = left;
	if(right<last && arr[right] > arr[largestroot])
		largestroot = right;
	
	//min heap conditions
	//if(left<last && arr[left]< arr[largestroot])
	//if(right<last && arr[right] < arr[largestroot])
	
	if(largestroot != root)
	{
		int temp= arr[root];
		arr[root] = arr[largestroot];
		arr[largestroot] = temp;
	
	buildheap(arr, last,largestroot);
	}	
 }
}
