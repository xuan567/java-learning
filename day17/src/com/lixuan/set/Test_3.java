package com.lixuan.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test_3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("c");
		list.add("c");
		System.out.println(list);
		getNewList(list);
		System.out.println(list);
	}

	public static void getNewList(ArrayList<String> list) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(list);
		list.clear();
		list.addAll(lhs);
	}
	

}
