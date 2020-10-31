package com.lixuan.Regex;

import java.util.Calendar;

public abstract class Test2_Calendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"年"+getNum(c.get(Calendar.MONTH)+1)
							+"月"+getNum(c.get(Calendar.DAY_OF_MONTH))+"日"
							+getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	public static String getNum(int num) {
		return num>9? ""+num:"0"+num;
	}
	public static String getWeek(int week) {
		String[] arr = {"","星期天","星期一","星期二","星期三","星期四","星期五","星期天"};
		return arr[week];
	}
}
