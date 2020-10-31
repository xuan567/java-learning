package com.lixuan.stringbuffer;

public class test4 {

	public static void main(String[] args) {
		int[] arr = {33,11,55,77,44,22,66};
		print(arr);
		System.out.println();
		//maopao(arr);
		xuanze(arr);
		print(arr);

	}
	public static void maopao(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void xuanze(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
