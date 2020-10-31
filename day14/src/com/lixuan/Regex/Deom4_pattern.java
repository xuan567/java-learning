package com.lixuan.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deom4_pattern {

	public static void main(String[] args) {
		String s ="我的电话号码是13579，之前还用过18732，很早之前还用过15378";
		Pattern p = Pattern.compile("1[13578]\\d{3}");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
