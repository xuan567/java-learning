package com.lixuan.map;

import java.util.TreeMap;

import com.lixuan.bean.Student;

public class Deom_4TreeMap {

	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>();
		tm.put(new Student("张三",23), "上海");
		tm.put(new Student("张三",23), "北京");
		tm.put(new Student("王五",23), "西安");
		tm.put(new Student("李四",23), "广州");
		System.out.println(tm);
	}

}
