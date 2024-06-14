package com.demo.test;

import com.demo.sort.InsertionSort;

public class TestInsertSort
{
	public static void main(String[] args) 
	{
		int[] arr=new int[5];
		
		System.out.println("Enter Array elements : ");
		InsertionSort.acceptData(arr);
		System.out.print("Unsorted Array : ");
		InsertionSort.displayData(arr);
		
		InsertionSort.sortData(arr);
		System.out.print("Sorted Array : ");
		InsertionSort.displayData(arr);
	}
}
