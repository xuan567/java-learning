package com.lixuan.list;

import java.util.LinkedList;

import com.lixuan.bean.Stack;

public class Demo4_LinkedList {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.in("a");
		s.in("b");
		s.in("c");
		s.in("d");
		while(!s.isEmpty()) {
			System.out.println(s.out());
		}
	}

}
