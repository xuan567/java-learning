package com.lixuan.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Deom1_collections {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("d");
		list.add("a");
		list.add("c");
		list.add("b");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.binarySearch(list, "e"));
		Collections.reverse(list);
		System.out.println(list);
	}

}
