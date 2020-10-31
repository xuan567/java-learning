package com.lixuan.File;

import java.io.File;

public class Deom1_File {

	public static void main(String[] args) {
		File f1 = new File("xxx.txt");
		System.out.println(f1.exists());
		File f2 = new File("yyy.txt");
		System.out.println(f2.exists());
	}

}
