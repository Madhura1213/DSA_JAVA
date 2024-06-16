package com.demo.test;
import com.demo.sort.SelectionSort;


public class SelectionSortTest {

	public static void main(String[] args) {
	
		int[] arr=new int[10];

		System.out.println("Enter Array elements : ");
		SelectionSort.acceptData(arr);
		
		System.out.print("Unsorted Array : \n");
		SelectionSort.displayData(arr);
		SelectionSort.sortdata(arr);
		
		System.out.print("Sorted Array : \n");
		SelectionSort.displayData(arr);
	}

}
