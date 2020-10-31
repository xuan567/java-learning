package com.lixuan.stringbuffer;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		int[] arr= {11,22,33,44,55,66,77};
		System.out.println(sort(arr,22));
		System.out.println(sort(arr,66));
		System.out.println(sort(arr,88));
	}
	public static int sort(int[] arr,int a) {
		int max = arr.length-1;
		int min = 0;
		int mid = ( max + min )/2;
		while(arr[mid]!=a) {
			if(arr[mid] > a) 
				max = mid - 1;
			if( arr[mid] < a)
				min = mid + 1;
			mid = (min + max)/2;
			if(min > max)
				return -1;
		}
		return mid;
	}

}
