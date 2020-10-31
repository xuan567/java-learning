package com.lixuan.stringbuffer;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(lineReverse(line));
	}
	public static String lineReverse(String line) {
		StringBuffer sb = new StringBuffer(line);
		sb.reverse();
		return sb.toString();
	}

}
