package com.lixuan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.lixuan.bean.Student;

public class Deom2_iterator {

	public static void main(String[] args) {
		deom1();
		Collection c = new ArrayList();
		c.add(new Student("张三",23));
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵六",26));
		c.add(new Student("王七",27));
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Student s = (Student)it.next();
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}

	public static void deom1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
//		Iterator it = c.iterator();
//		boolean b1 = it.hasNext();
//		Object obj1 =  it.next();
//		System.out.println(b1);
//		System.out.println(obj1);
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
