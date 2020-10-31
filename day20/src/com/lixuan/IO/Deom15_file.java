package com.lixuan.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Deom15_file {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»Î ˝æ›");
		FileOutputStream file = new FileOutputStream("aaa.txt");
		while(true) {
			String s = sc.nextLine();
			if("quit".equals(s))
				break;
			file.write(s.getBytes());
			file.write("\r\n".getBytes());
		}
		file.close();
	}

}
