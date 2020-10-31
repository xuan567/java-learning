package com.lixuan.set;

import java.util.HashSet;

public class Deom1_hashset {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("a");
		for (String string : hs) {
			System.out.println(string);
		}
	}

}
