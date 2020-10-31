package com.lixuan.list;

public class Changeable {

	public static void main(String[] args) {
		print(11,22,33,44);
	}
	public static void print(int...arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
