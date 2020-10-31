package com.lixuan.test;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë×Ö·û´®");
		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine();
		char[] arr = l.toCharArray();
		String s = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			s=s+arr[i];
		}
		System.out.println(s);
	}

}
