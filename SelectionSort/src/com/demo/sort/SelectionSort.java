package com.demo.sort;

import java.util.Scanner;

public class SelectionSort {

	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter num");
			arr[i]=sc.nextInt();
		}
		
	}

	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n---------------");
		
	}
	private static int findmin(int[] arr, int start, int end)
	{
		int min= arr[start];
		int minidx= start;
		for(int i = start;i<end;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
				minidx = i;
			}
		}
		return minidx;
	}

	public static void sortdata(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			int minidx =  findmin(arr,i,arr.length);
			
			//swap min index and start index
			int temp = arr[i];
			arr[i]= arr[minidx];
			arr[minidx] = temp;
		}
		
	}

}
