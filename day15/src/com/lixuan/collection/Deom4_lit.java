package com.lixuan.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Deom4_lit {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("wang");
		list.add("world");
		list.add("qqq");
		list.add("eee");
		System.out.println(list);
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			String str =(String) lit.next();
			if("world".equals(str)) {
				lit.add("java");
			}
		}
		System.out.println(list);
	}

}
