package com.lixuan.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Deom12_TryFinally {

	public static void main(String[] args) throws IOException {
		//deom1();
		try (
			FileInputStream fis = new FileInputStream("xxx.txt");
			FileOutputStream fos = new FileOutputStream("yyy.txt");
			myClose mc = new myClose();
		){
			int b;
			while((b=fis.read())!=-1) {
				fos.write(b);
			}
		}
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			int b;
			while((b=fis.read())!=-1) {
				fos.write(b);
			}
		}finally {
				try {
					if(fis!=null) {
						fis.close();
					}
				}finally {
					if(fos!=null) {
						fos.close();
					}
				}
			}
	}

}

class myClose implements AutoCloseable{
	public void close() {
		System.out.println("�ҹر���");
	}
}