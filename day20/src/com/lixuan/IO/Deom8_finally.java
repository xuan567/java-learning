package com.lixuan.IO;

public class Deom8_finally {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("������");
			System.exit(0);
		}finally {
			System.out.println("����ִ����");
		}
	}

}
