package com.lixuan.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class deom11_Chinese {

	public static void main(String[] args) throws IOException  {
		//deom1();
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		fos.write("�Ҷ����٣���ƭ��".getBytes());
		fos.write("\r\n".getBytes());
		fos.close();
	}

	public static void deom1() throws FileNotFoundException, IOException {
		FileInputStream f = new FileInputStream("yyy.txt");
		byte[] arr = new byte[4];
		int len;
		while((len=f.read(arr))!=-1) {
			System.out.println(new String(arr,0,len));
		}
		f.close();
	}

}
