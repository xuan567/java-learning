package com.lixuan.IO;

public class Deom6_Throwable {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			//System.out.println(e);
			e.printStackTrace();
		}
	}

}
