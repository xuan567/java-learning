package com.lixuan.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asList {

	public static void main(String[] args) {
		//deom1();
		ArrayList<String> list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String[] arr = list.toArray(new String[0]);
		for (String string : arr) {
			System.out.println(string);
		}
	}

	public static void deom1() {
		Integer[] arr = {11,22,33,44,55};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
	}

}
