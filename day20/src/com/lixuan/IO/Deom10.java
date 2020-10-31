package com.lixuan.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Deom10 {

	public static void main(String[] args) throws IOException {
		//deom1();
		
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("copyxxx.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b=bis.read())!=-1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

}
