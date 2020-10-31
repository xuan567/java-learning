package com.lixuan.IO;

public class Deom9_finally {

	public static void main(String[] args) {
		Deom d = new Deom();
		int x = d.method();
		System.out.println(x);
	}

}

class Deom{
	public int method() {
		int x = 10;
		try {
			x=20;
			System.out.println(1/0);
			return x;
		}catch(Exception e) {
			x=30;
			return x;
		}finally {
			x=40;
		}
	}
}
