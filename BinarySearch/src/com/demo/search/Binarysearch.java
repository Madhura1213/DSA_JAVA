package com.demo.search;

public class Binarysearch {
	
	public static int Binarysearch(int[] arr, int start, int end, int num){
		int mid = (start+end)/2;
		
		if(arr[mid] == num) {
			System.out.println(arr[mid]);
			return num;
		}
		
		if(arr[mid]> num) {
			System.out.println(arr[mid] +" start " +start);
			return Binarysearch(arr, start, mid-1, num);
		}
		if(arr[mid]< num){
			System.out.println(arr[mid]);
			return Binarysearch(arr, mid+1, end, num);
		}
		return -1;
		
	}
	
	
}
