package com.lixuan.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.lixuan.bean.Student;

public class Deom1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//deom1();
		Collection c = new ArrayList();
		c.add(new Student("张三",23));
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵六",26));
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			Student s = (Student)arr[i];
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}

	public static void deom1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
