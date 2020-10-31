package com.lixuan.charIo;

import java.io.File;
import java.util.Scanner;

public class Deom11_file {

	public static void main(String[] args) {
		File dir = getDir();
		printJavaFile(dir);
	}
	public static File getDir() {
		System.out.println("�������ļ�����");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists())
				System.out.println("������");
			else if(dir.isFile())
				System.out.println("��������ļ���");
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
