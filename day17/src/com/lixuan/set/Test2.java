package com.lixuan.set;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���");
		HashSet<Character> hs = new HashSet<>();
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			hs.add(c);
		}
		for (char c : hs) {
			System.out.println(c);
		}
	}

}
