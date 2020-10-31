package com.lixuan.Regex;

import java.util.Calendar;
import java.util.Scanner;

public class Test3_Calendar {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄê·İ");
		String s = sc.nextLine();
		int year = Integer.parseInt(s);
		boolean b = getYear(year);
		System.out.println(b);
	}
	public static boolean getYear(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, 2 , 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.get(Calendar.DAY_OF_MONTH)==29?true:false;
	}

}
