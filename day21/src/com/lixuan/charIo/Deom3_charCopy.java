package com.lixuan.charIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Deom3_charCopy {

	public static void main(String[] args) throws IOException {
		//deom1();
		//deom2();
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		int c;
		while((c=br.read())!=-1) {
			bw.write(c);
		}
		br.close();
		bw.close();
	}

	public static void deom2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		char[] arr = new char[1024];
		int c;
		while((c=fr.read(arr))!=-1) {
			fw.write(arr,0,c);
		}
		fr.close();
		fw.close();
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("zzz.txt");
		int b;
		while((b=fr.read())!=-1) {
			fw.write(b);
		}
		fr.close();
		fw.close();
	}

}
