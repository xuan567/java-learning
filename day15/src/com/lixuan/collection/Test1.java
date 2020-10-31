package com.lixuan.collection;

import java.util.ArrayList;
import java.util.List;

import com.lixuan.bean.Student;

public class Test1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("张三",23));
		list.add(new Student("李四",24));
		list.add(new Student("王五",25));
		for (int i = 0; i < list.size() ; i++) {
			Student s = (Student)list.get(i);
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}

}
