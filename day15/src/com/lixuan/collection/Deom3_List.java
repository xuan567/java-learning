package com.lixuan.collection;

import java.util.ArrayList;
import java.util.List;

public class Deom3_List {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(2,"w");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		Object obj= list.get(0);
		System.out.println(obj);
		System.out.println(list.get(1));
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			
		}
		list.set(2, "c");
		System.out.println(list);
	}

}
