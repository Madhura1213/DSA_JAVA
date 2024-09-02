package com.demo.sort;

import java.util.Scanner;

public class BubbleSort {

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
	
	public static void sortdata(int[] arr) {
		
		boolean flag = false;
		int temp = 0;
		
		for(int i =0;i < arr.length;i++) {
			for(int j =i+1;j < arr.length;j++) {
				
				if(arr[i]> arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag) {
				System.out.println("No swaps");
				break;
			}
		}
		
		
	}
}
