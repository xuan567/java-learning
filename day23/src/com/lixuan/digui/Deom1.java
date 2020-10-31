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
		System.out.println("请输入");
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line); 
			if(!dir.exists())
				System.out.println("不存在");
			else if(dir.isFile())
				System.out.println("不是文件夹名");
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
