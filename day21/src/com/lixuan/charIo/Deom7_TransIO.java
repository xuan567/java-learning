package com.lixuan.charIo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Deom7_TransIO {

	public static void main(String[] args) throws IOException {
		//deom1();
		//deom2();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8"),"utf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk"));
		int b;
		while((b=br.read())!=-1) {
			bw.write(b);
		}
		br.close();
		bw.close();
	}

	public static void deom2() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8"),"utf-8");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
		int b;
		while((b=isr.read())!=-1) {
			osw.write(b);
		}
		isr.close();
		osw.close();
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("utf-8");
		FileWriter fw = new FileWriter("gbk.txt");
		int b;
		while((b=fr.read())!=-1) {
			fw.write(b);
		}
		fr.close();
		fw.close();
	}

}
