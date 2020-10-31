package com.lixuan.digui;

import java.io.File;

public class Deom3 {

	public static void main(String[] args) {
		File src = Deom1.getDir();
		File dest = Deom1.getDir();
		copy(src,dest);
	}
	public static void copy(File src,File dest) {
		File newDir = new File(dest,src.getName());
		newDir.mkdir();
		File[] subFile = src.listFiles();
		for(File sub)
	}

}
