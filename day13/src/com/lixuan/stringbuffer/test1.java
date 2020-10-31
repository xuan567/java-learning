package com.lixuan.stringbuffer;

public class test1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer s1=sb.append("lixuan");
		StringBuffer s2=sb.append(" ai ");
		StringBuffer s3=sb.append("wangjunkai");
		
		System.out.println(sb);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		StringBuffer sb1=sb.insert(3, 123);
		System.out.println(sb1);

	}

}
