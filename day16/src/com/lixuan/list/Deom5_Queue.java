package com.lixuan.list;

import com.lixuan.bean.Queue;

public class Deom5_Queue {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.in("a");
		q.in("b");
		q.in("c");
		q.in("d");
		
		while(!q.isEmpty()) {
			System.out.println(q.out());
		}
	}

}
