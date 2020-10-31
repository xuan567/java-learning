package com.lixuan.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Deom1_FileInputStream {

	public static void main(String[] args) throws IOException {
		//deom1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		int x;
		while((x=fis.read())!=-1) {
			System.out.println(x);
		}
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		int x = fis.read();
		System.out.println(x);
		
		int y = fis.read();
		System.out.println(y);
		fis.close();
	}

}
