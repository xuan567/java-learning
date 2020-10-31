package com.lixuan.othersIO;

import java.io.IOException;
import java.io.InputStream;

public class Deom6_systemInOut {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		int x =is.read();
		System.out.println(x);
	}

}
