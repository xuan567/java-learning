package com.lixuan.bean;

import java.util.LinkedList;

public class Queue {
	private LinkedList list = new LinkedList();
	
	public void in(Object obj) {
		list.addLast(obj);
	}
	public Object out() {
		return list.removeFirst();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
