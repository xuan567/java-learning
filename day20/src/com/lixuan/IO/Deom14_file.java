package com.lixuan.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Deom14_file {

	public static void main(String[] args) throws IOException {
		File file = getFileName();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		while((b=bis.read())!=-1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	public static File getFileName() {
		System.out.println("请输入文件名");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.nextLine();
			File file = new File(s);
			if(!file.exists())
				System.out.println("该文件不存在");
			else if(file.isDirectory())
				System.out.println("输入的是文件目录");
			else
				return file;
		}
	}
}
