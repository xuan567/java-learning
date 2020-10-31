package com.lixuan.list;

import java.util.ArrayList;

import com.lixuan.bean.Preson;

public class Deom9 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Preson>> list = new ArrayList<>();
		
		ArrayList<Preson> first = new ArrayList<>();
		first.add(new Preson("张三",23));
		first.add(new Preson("李四",24));
		first.add(new Preson("王五",25));
		
		ArrayList<Preson> second = new ArrayList<>();
		second.add(new Preson("赵六",26));
		
		list.add(first);
		list.add(second);
		for ( ArrayList<Preson> a: list) {
			for (Preson preson : a) {
				System.out.println(preson);
			}
		}
	}

}
