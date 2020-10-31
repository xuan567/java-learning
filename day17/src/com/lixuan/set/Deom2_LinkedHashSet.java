package com.lixuan.set;

import java.util.LinkedHashSet;

public class Deom2_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		lhs.add("a");
		System.out.println(lhs);
	}

}
