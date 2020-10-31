package com.lixuan.othersIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Deom1 {

	public static void main(String[] args) throws IOException {
		//deom1();
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		FileOutputStream fos = new FileOutputStream("d.txt");
		int b;
		while((b=sis.read())!=-1) {
			fos.write(b);
		}
		sis.close();
		fos.close();
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("c.txt");
		int b1;
		while((b1=fis1.read())!=-1) {
			fos.write(b1);
		}
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("b.txt");
		int b2;
		while((b2=fis2.read())!=-1) {
			fos.write(b2);
		}
		fis2.close();
		fos.close();
	}

}
