package com.lixuan.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Deom3_FileOutputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("QQͼƬ20200501184352.jpg"); 
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		//deom1(fis, fos);
		byte[] arr = new byte[fis.available()];
		fis.read(arr);
		fos.write(arr);
		fis.close();
		fos.close();
	}

	public static void deom1(FileInputStream fis, FileOutputStream fos) throws IOException {
		int b;
		while((b = fis.read())!=-1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
