package com.lixuan.list;

import java.util.ArrayList;

import com.lixuan.bean.Preson;

public class Deom9 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Preson>> list = new ArrayList<>();
		
		ArrayList<Preson> first = new ArrayList<>();
		first.add(new Preson("����",23));
		first.add(new Preson("����",24));
		first.add(new Preson("����",25));
		
		ArrayList<Preson> second = new ArrayList<>();
		second.add(new Preson("����",26));
		
		list.add(first);
		list.add(second);
		for ( ArrayList<Preson> a: list) {
			for (Preson preson : a) {
				System.out.println(preson);
			}
		}
	}

}
