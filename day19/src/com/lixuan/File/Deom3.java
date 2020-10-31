package com.lixuan.File;

import java.io.File;
import java.io.FilenameFilter;

public class Deom3 {

	public static void main(String[] args) {
		File f = new File("D:\\");
//		String[] arr = f.list();
//		for (String string : arr) {
//			if(string.endsWith(".jpg"))
//				System.out.println(string);
//		}
//		File[] subFile = f.listFiles();
//		for (File file : subFile) {
//			if(file.isFile()&&file.getName().endsWith(".jpg"))
//				System.out.println(file);
//		}
		String[] arr = f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return dir.isFile()&&dir.getName().endsWith(".jpg");
			}
		});
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
