package com.lixuan.othersIO;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Deom2_ByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
		//deom1();
		FileInputStream fis = new FileInputStream("a.txt");
		byte[] arr = new byte[5];
		int len;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		while((len=fis.read(arr))!=-1) {
			baos.write(arr,0,len);
		}
		System.out.println(baos);
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int b;
		while((b=fis.read())!=-1) {
			baos.write(b);
		}
		System.out.println(baos.toString());
		fis.close();
	}

}
