package com.demo.sort;

import java.util.Scanner;

public class InsertionSort 
{
	
	public static void acceptData(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter "+i+" Number");
			arr[i]=sc.nextInt();
		}
	}

	public static void displayData(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println("\n-------------------");
	}

	public static void sortData(int[] arr) 
	{
		
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		
		
	}
}
