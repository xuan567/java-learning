package com.lixuan.Regex;

public class Deom3 {

	public static void main(String[] args) {
		//deom1();
		//deom2();
		//deom3();
		String s = "我我...要要........要学...........学学学编程";
		String regex="(\\.)";
		String s2 = s.replaceAll(regex, "");
		System.out.println(s2);
		String s3 = s2.replaceAll("(.)\\1+", "$1");
		System.out.println(s3);
	}

	public static void deom3() {
		String s = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";
		String[] arr = s.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void deom2() {
		String regex = "(..)\\1+";
		System.out.println("快乐快乐".matches(regex));
		System.out.println("快快乐乐".matches(regex));
		System.out.println("快乐快乐快乐快乐".matches(regex));
	}

	public static void deom1() {
		String regex = "(.)\\1(.)\\2";
		System.out.println("快快乐乐".matches(regex));
		System.out.println("快乐快乐".matches(regex));
	}

}
