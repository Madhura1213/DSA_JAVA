package demo.mergesort;


public class MergeSortTest {

	public static void main(String[] args) 
	{
		
		int []arr= new int [5]; 
		System.out.println("Enter elements to sort:");
		MergeSort.acceptdata(arr);
		System.out.println("Unsorted Elements: ");
		MergeSort.displaydata(arr);
		MergeSort.mergedata(arr,0,arr.length-1);
		System.out.println("Sorted Elements : ");
		MergeSort.displaydata(arr);

	}

}
