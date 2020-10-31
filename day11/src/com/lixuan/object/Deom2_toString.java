package com.lixuan.object;

import com.lixuan.bean.Student;

public class Deom2_toString {

	public static void main(String[] args) {
		Student s = new Student("张三",23);
		System.out.println(s.toString());
		System.out.println(s);
		Student s1 = new Student("张三",23);
		Student s2 = new Student("张三",23);
		boolean b = s1.equals(s2);
		System.out.println(b);
		System.out.println(s1==s2);
	}

}
