package com.demo.search;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,3,5,7,9,15,24,36,64,68,74,99};

		System.out.println("Enter a number : ");
		int num= sc.nextInt();
		int foundnum =Binarysearch.Binarysearch(arr, 0, arr.length-1, num);
		System.out.println("Found number is "+ foundnum);
	}

}
