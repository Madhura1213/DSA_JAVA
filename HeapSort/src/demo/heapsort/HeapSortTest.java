package demo.heapsort;


public class HeapSortTest {

	public static void main(String[] args) {
		
	
		int[] arr = new int[8];
		System.out.println("Enter elements to be sorted :");
		HeapSort.acceptData(arr);
		System.out.println("Unsorted Array :");
		HeapSort.displayData(arr);
		
		HeapSort.heapsort(arr);
		
		System.out.println("\n Sorted array :");
		HeapSort.displayData(arr);
		
	}
}
