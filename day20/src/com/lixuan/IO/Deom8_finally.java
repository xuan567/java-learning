package com.lixuan.IO;

public class Deom8_finally {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("出错了");
			System.exit(0);
		}finally {
			System.out.println("还是执行了");
		}
	}

}
