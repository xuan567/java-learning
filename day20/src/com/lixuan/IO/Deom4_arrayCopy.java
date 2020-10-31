package com.lixuan.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Deom4_arrayCopy {

	public static void main(String[] args) throws IOException {
		//deom1();
		//deom2();
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		byte[] arr = new byte[1024*8];
		int len;
		while((len = fis.read(arr))!=-1) {
			fos.write(arr,0,len);
		}
		fis.close();
		fos.close();
	}

	public static void deom2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr))!=-1) {
			fos.write(arr,0,len);
		}
		fis.close();
		fos.close();
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		
		byte[] arr = new byte[2];
		int a = fis.read(arr);
		System.out.println(a);
		for (byte b : arr) {
			System.out.println(b);
		}
		System.out.println("------------");
		
		int c = fis.read(arr);
		System.out.println(c);
		for (byte b : arr) {
			System.out.println(b);
		}
		fis.close();
	}

}
