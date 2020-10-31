package com.lixuan.Regex;

import java.util.Calendar;

public abstract class Test2_Calendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"��"+getNum(c.get(Calendar.MONTH)+1)
							+"��"+getNum(c.get(Calendar.DAY_OF_MONTH))+"��"
							+getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	public static String getNum(int num) {
		return num>9? ""+num:"0"+num;
	}
	public static String getWeek(int week) {
		String[] arr = {"","������","����һ","���ڶ�","������","������","������","������"};
		return arr[week];
	}
}
