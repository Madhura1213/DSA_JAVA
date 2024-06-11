package demo.quicksort;

public class QuickSortTest {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		System.out.println("Enter elements to be sorted: ");
		QuickSort.acceptdata(arr);
		System.out.println("Unsorted Elements :");
		QuickSort.displaydata(arr);
		
		QuickSort.sortdata(arr,0,arr.length-1);
		System.out.println("Sorted Elements :");
		QuickSort.displaydata(arr);
	}

}
