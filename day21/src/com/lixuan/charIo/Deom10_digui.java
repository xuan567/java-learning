package com.lixuan.charIo;

public class Deom10_digui {

	public static void main(String[] args) {
		System.out.println(fun(50));
	}
	public static int fun(int n) {
		if(n==1)
			return n;
		else
			return n*fun(n-1);
	}
}
