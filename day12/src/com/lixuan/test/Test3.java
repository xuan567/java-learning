package com.lixuan.test;

public class Test3 {

	public static void main(String[] args) {
		String s = "ABCDabcde123456@#%$&";
		int big =0;
		int small = 0;
		int num=0;
		int other = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c>='A'&&c<='Z')
				big++;
			else if(c>='a'&&c<='z')
				small++;
			else if(c>='0'&&c<='9')
				num++;
			else 
				other++;
		}
		System.out.println("大写字母:"+big+",小写字母:"+small+",数字:"+num+",其他:"+other);

	}

}
