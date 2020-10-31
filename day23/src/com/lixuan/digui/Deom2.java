package com.lixuan.digui;

import java.io.File;

public class Deom2 {

	public static void main(String[] args) {

	}
	public static void deleteFile(File dir) {
		File[] subFiles = dir.listFiles();
		for ( File subFile : subFiles) {
			if(subFile.isFile())
				subFile.delete();
			else
				deleteFile(subFile);
		}
		dir.delete();
	}

}
