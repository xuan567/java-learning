package com.lixuan.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.lixuan.bean.Preson;

public class Deom8_foreach {

	public static void main(String[] args) {
		//deom1();
		//deom2();
		//deom3();
		//deom4(list);
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("b");
		
	}

	public static void deom4(ArrayList<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if("b".equals(it.next())) {
				it.remove();
			}
		}
		System.out.println(list);
	}

	public static void deom3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("b");
		for(int i = 0;i<list.size();i++) {
			if("b".equals(list.get(i))) {
				list.remove(i--);
			}
		}
		System.out.println(list);
	}

	public static void deom2() {
		ArrayList<Preson> list = new ArrayList<>();
		list.add(new Preson("����",23));
		list.add(new Preson("����",24));
		list.add(new Preson("����",25));
		for (Preson preson : list) {
			System.out.println(preson);
		}
	}

	public static void deom() {
		int[] arr = {11,22,33,44};
		for (int i : arr) {
			System.out.println(i);
		}
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
