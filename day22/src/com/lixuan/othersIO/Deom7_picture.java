package com.lixuan.othersIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Deom7_picture {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("copy2.jpg"));
		System.setOut(new PrintStream("picture.jpg"));
		
		InputStream is = System.in;
		PrintStream os = System.out;
		
		byte[] arr = new byte[1024];
		int b;
		while((b=is.read(arr))!=-1) {
			os.write(arr,0,b);
		}
		is.close();
		os.close();
	}

}
