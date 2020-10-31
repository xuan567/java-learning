package com.lixuan.othersIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Deom5_DataOutputStream {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("e.txt"));
		dos.writeInt(997);
		dos.writeInt(998);
		dos.writeInt(999);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("e.txt"));
		int x = dis.readInt();
		int y = dis.readInt();
		int z = dis.readInt();
		System.out.println(x+" "+y+" "+z);
	}

}
