package com.lixuan.charIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Deom1_FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("xxx.txt");
		int b;
		while((b=fr.read())!=-1) {
			System.out.print((char)b);
		}
		fr.close();
	}

}
