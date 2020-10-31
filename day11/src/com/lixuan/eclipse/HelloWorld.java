package com.lixuan.eclipse;

import com.lixuan.bean.Student;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello");
		Student s = new Student ("zhang",23);
		System.out.println(s.getName()+s.getAge());

	}

}
