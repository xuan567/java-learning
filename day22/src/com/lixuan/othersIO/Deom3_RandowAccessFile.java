package com.lixuan.othersIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Deom3_RandowAccessFile {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");
		int x;
		x=raf.read();
		System.out.println(x);
		raf.seek(10);
		raf.write(97);
		raf.close();
	}

}
