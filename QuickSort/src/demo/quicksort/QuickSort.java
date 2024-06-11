package demo.quicksort;
import java.util.Scanner;

public class QuickSort {

	public static void acceptdata(int[] arr) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter num:");
			arr[i]=sc.nextInt();
		}
	}

	public static void displaydata(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"-->"+arr[i]);
		}	
		System.out.println("--------------------");
	}


	public static void sortdata(int[] arr, int start, int end) {
		
		if(start<end) {
		int p = partition(arr, start, end);
		sortdata(arr,start,p-1);
		sortdata(arr,p+1,end);
		}
	}

	private static int partition(int[] arr, int start, int end)
	{
		int pivot = start;
		int i= start;
		int j= end;
		
		while(i<j)
		{
			while(i<end && arr[i]<=arr[pivot])
			i++;
			while(j>pivot && arr[j]>= arr[pivot])
			j--;
			if(i<j)
			{
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j]= arr[pivot];
		arr[pivot]= temp;
		
		return j;
	}
	
}
