package com.lixuan.charIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Deom8_TreeMap {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		int c;
		TreeMap<Character, Integer> tm = new TreeMap<>();
		while((c=br.read())!=-1) {
			char ch = (char) c;
			tm.put(ch, !tm.containsKey(ch)?1:tm.get(ch)+1);
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("ccc.txt"));
		for (Character key : tm.keySet()) {
			switch(key){
				case '\t': 
					bw.write("\\t"+"="+tm.get(key));
					break;
				case '\n': 
					bw.write("\\n"+"="+tm.get(key));
					break;
				case '\r': 
					bw.write("\\r"+"="+tm.get(key));
					break;
				default:
					bw.write(key+"="+tm.get(key));
					break;
			}
			bw.newLine();
		}
		bw.close();
	}

}
