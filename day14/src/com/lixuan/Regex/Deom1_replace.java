package com.lixuan.Regex;

public class Deom1_replace {

	public static void main(String[] args) {
		String s ="wangjunkai123aili34xuan";
		String regex = "\\d";
		String s2 = s.replaceAll(regex,"");
		System.out.println(s2);
	}

}
