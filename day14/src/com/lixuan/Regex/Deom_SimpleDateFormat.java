package com.lixuan.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deom_SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("y/M/d h:m:s");
//		System.out.println(sdf.format(d));
		
		String s = "2020/7/6 08:08:08";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date d = sdf1.parse(s);
		System.out.println(d);

	}

}
