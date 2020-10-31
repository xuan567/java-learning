package com.lixuan.map;


import java.util.HashMap;

import com.lixuan.bean.Student;

public class Deom2_HashSet {

	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap(); 
		hm.put(new Student("张三",23), "上海");
		hm.put(new Student("张三",23), "北京");
		hm.put(new Student("王五",23), "西安");
		hm.put(new Student("李四",23), "广州");
		System.out.println(hm);
	}

}
