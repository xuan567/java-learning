package com.lixuan.File;

import java.io.File;
import java.io.IOException;

public class Deom_fileMethod {

	public static void main(String[] args) throws IOException {
		//deom1();
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		
		File dir2 = new File("bbb.txt");
		System.out.println(dir2.mkdir());

	}

	public static void deom1() throws IOException {
		File f1 = new File("zzz");
		System.out.println(f1.createNewFile());
	}

}
