package com.lixuan.stringbuffer;

public class stringBuffer {

	public static void main(String[] args) {
		//deom1();
		StringBuffer sb = new StringBuffer("lixuan");
		String s1 = new String(sb);
		System.out.println(s1);
		
		String s2 = sb.toString();
		System.out.println(s2);
		
		String s3 = sb.substring(0,4);
		System.out.println(s3);
	}

	private static void deom1() {
		StringBuffer sb = new StringBuffer("lixuan");
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer();
		sb2.append("lixuan");
		System.out.println(sb2);
	}

}
