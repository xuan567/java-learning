package com.lixuan.Regex;

public class Deom6_System {

	public static void main(String[] args) {
		String[] s1 = {"11","22","33","44"};
		String[] s2 = new String[8];
		System.arraycopy(s1, 1, s2, 2, 3);
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i]+" ");
		}

	}

}
