package com.lixuan.charIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Deom4_readLine {

	public static void main(String[] args) throws IOException {
		deom1();
//		BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
//		String s ;
//		while((s=br.readLine())!=null) {
//			bw.write(s);
//		}
	}

	public static void deom1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}
	}

}
