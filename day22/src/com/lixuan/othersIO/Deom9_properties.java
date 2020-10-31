package com.lixuan.othersIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Deom9_properties {

	public static void main(String[] args) throws IOException, IOException {
		//deom1();
		//deom2();
		Properties prop = new Properties();
		System.out.println(prop);
		prop.load(new FileInputStream("p.txt"));
		
		prop.setProperty("tel", "19888888");
		prop.store(new FileOutputStream("p.txt"), "xxx");
		System.out.println(prop);
	}

	public static void deom2() {
		Properties pop = new Properties();
		pop.setProperty("name", "ÕÅÈý");
		pop.setProperty("tel", "123");
		Enumeration<String> en = (Enumeration<String>) pop.propertyNames();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key+" = "+pop.getProperty(key));
		}
	}

	public static void deom1() {
		Properties prop = new Properties();
		prop.put("abc", 123);
		System.out.println(prop);
	}

}
