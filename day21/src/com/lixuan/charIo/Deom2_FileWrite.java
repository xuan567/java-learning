package com.lixuan.charIo;

import java.io.FileWriter;
import java.io.IOException;

public class Deom2_FileWrite {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("��Һã�Ŭ��ѧϰ");
		fw.write("a");
		fw.write(97);
		fw.close();
	}

}
