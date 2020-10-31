package com.lixuan.list;

import java.util.LinkedList;

public class Deom3_LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add("0");
		list.addFirst("a");
		list.addFirst("a");
		list.addLast("b");
		list.addLast("b");
		list.addFirst("1");
		list.addLast("2");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(3));
		list.removeFirst();
		list.removeLast();
		list.remove("a");
		System.out.println(list);
	}

}
