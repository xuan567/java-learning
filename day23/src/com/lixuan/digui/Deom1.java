package com.lixuan.digui;

import java.io.File;
import java.util.Scanner;

public class Deom1 {

	public static void main(String[] args) {
		File dir = getDir();
		System.out.println(dir.getFileLength());
	}
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������");
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line); 
			if(!dir.exists())
				System.out.println("������");
			else if(dir.isFile())
				System.out.println("�����ļ�����");
			else
				return dir;
		}
	}
	
	public static long getFileLength(File dir) {
		long len = 0;
		File[]  subFiles = dir.listFiles();
		for (File file : subFiles) {
			if(file.isFile())
				len+=file.length();
			else
				len+=getFileLength(file);
		}
		return len;
	}

}
