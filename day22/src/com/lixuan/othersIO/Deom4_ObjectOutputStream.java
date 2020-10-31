package com.lixuan.othersIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.lixuan.bean.Preson;

public class Deom4_ObjectOutputStream {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		//deom1();
		Preson p1 = new Preson("张三",23);
		Preson p2 = new Preson("李四",24);
		Preson p3 = new Preson("王五",25);
		Preson p4 = new Preson("赵六",26);
		ArrayList<Preson> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));
		oos.writeObject(list);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d.txt"));
		ArrayList<Preson> list2 = (ArrayList<Preson>)ois.readObject();
		for (Preson preson : list2) {
			System.out.println(preson);
		}
	}

	public static void deom1() throws IOException, FileNotFoundException, ClassNotFoundException {
		Preson p1 = new Preson("张三",23);
		Preson p2 = new Preson("李四",24);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d.txt"));
		Preson p3 = (Preson) ois.readObject();
		Preson p4 = (Preson) ois.readObject();
		System.out.println(p3);
		System.out.println(p4);
		ois.close();
	}

}
