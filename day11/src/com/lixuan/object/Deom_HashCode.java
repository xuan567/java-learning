package com.lixuan.object;

import com.lixuan.bean.Student;

public class Deom_HashCode {

	public static void main(String[] args) {
		Object o1 = new Object();
		int hashcode = o1.hashCode();
		System.out.println(hashcode);
		
		Student s1 = new Student("张三",23);
		Student s2 = new Student("李四",24);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
