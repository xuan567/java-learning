package com.lixuan.charIo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Deom9_times {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		int times;
		String line = br.readLine();
		times = Integer.parseInt(line);
		if(times>0) {
			System.out.println("�㻹ʣ"+times-- +"����");
			FileWriter fw = new FileWriter("a.txt");
			fw.write(times+"");
			fw.close();
		}
		else
			System.out.println("��ѵĻ���������");
		br.close();
	}

}
