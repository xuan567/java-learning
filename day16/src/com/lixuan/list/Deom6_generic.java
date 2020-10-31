package com.lixuan.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.lixuan.bean.Preson;

public class Deom6_generic {

	public static void main(String[] args) {
		ArrayList<Preson> list = new ArrayList<Preson>();
		list.add(new Preson("张三",23));
		list.add(new Preson("李四",24));
		list.add(new Preson("王五",25));
		Iterator<Preson> it = list.iterator();
		while(it.hasNext()) {
			Preson p = it.next();
			System.out.println(p.getName()+"..."+p.getAge());
		}
	}

}
