package com.lixuan.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Deom13_jpg {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy1.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.jpg"));
		int b;
		while((b=bis.read())!=-1) {
			bos.write(b^123);
		}
		bis.close();
		bos.close();
	}

}
