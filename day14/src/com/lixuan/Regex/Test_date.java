package com.lixuan.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_date {

	public static void main(String[] args) throws ParseException {
		String birthday = "1976/03/09";
		String today = "2020/7/6";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		long time = d2.getTime()-d1.getTime();
		System.out.println(time/1000/60/60/24);
	}

}
