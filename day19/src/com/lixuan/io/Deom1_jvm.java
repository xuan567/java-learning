package com.lixuan.io;

public class Deom1_jvm {

	public static void main(String[] args) {
		Deom d = new Deom();
		int x = d.div(10, 0);
		System.out.println(x);
	}

}
class Deom{
	public int div(int a,int b) {
		return a/b;
	}
}