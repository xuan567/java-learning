package com.lixuan.io;

public class Deom2_tryCash {

	public static void main(String[] args) {
		Deom2 d = new Deom2();
		try {
			int x = d.div(10, 1);
			System.out.println(x);
		}catch(ArithmeticException a){
			System.out.println("�����ˣ�����Ϊ��");
		}

	}

}

class Deom2{
	public int div(int a,int b) {
		return a/b;
	}
}
