package com.lixuan.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Deom1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("c");
		ArrayList newList = getNew(list);
		System.out.println(newList);
	}
	public static ArrayList getNew(ArrayList list) {
		ArrayList newList = new ArrayList<>();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(!newList.contains(obj))
				newList.add(obj);
		}
		return newList;
	}

}
