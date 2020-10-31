package com.lixuan.charIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Deom6_LineNumberRead {

	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("bbb.txt"));
		//lnr.setLineNumber(100);
		String line;
		while((line=lnr.readLine())!=null) {
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		lnr.close();
	}

}
