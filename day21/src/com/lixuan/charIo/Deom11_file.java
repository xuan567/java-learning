package com.lixuan.charIo;

import java.io.File;
import java.util.Scanner;

public class Deom11_file {

	public static void main(String[] args) {
		File dir = getDir();
		printJavaFile(dir);
	}
	public static File getDir() {
		System.out.println("请输入文件夹名");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists())
				System.out.println("不存在");
			else if(dir.isFile())
				System.out.println("输入的是文件名");
			else 
				return dir;
		}
			
	}
	public static void printJavaFile(File dir) {
		File[] subFiles = dir.listFiles();
		for (File file : subFiles) {
			if(file.isFile()&&file.getName().endsWith(".java"))
				System.out.println(file.getName());
			else if(file.isDirectory())
				printJavaFile(file);
		}
	}

}
