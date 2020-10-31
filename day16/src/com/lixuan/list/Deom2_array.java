package com.lixuan.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.lixuan.bean.Preson;

public class Deom2_array {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Preson("张三",23));
		list.add(new Preson("张三",23));
		list.add(new Preson("李四",23));
		list.add(new Preson("张三",23));
		list.add(new Preson("李四",24));
		list.add(new Preson("李四",24));
		ArrayList newList = new ArrayList();
		newList = getNew(list);
		System.out.println(newList);
	}
	public static ArrayList getNew(ArrayList list) {
		Iterator it = list.iterator();
		ArrayList newList = new ArrayList();
		while(it.hasNext()) {
			Object obj = it.next();
			if(!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		return newList;
	}

}
