package com.lixuan.test;

public class test7 {

	public static void main(String[] args) {
		String s1="wangjunkaiailixuan,lixuanaiwangjunkai,lixuanwangjunkai,heiheihei";
		String s2="wangjunkai";
		String s3="lixuan";
		int count=0;
		int index=0;
		while((index=s1.indexOf(s3))!=-1) {
			count++;
			s1=s1.substring(index+s3.length());
		}
		System.out.println(count);
	}

}
