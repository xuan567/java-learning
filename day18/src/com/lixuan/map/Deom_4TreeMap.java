package com.lixuan.map;

import java.util.TreeMap;

import com.lixuan.bean.Student;

public class Deom_4TreeMap {

	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>();
		tm.put(new Student("����",23), "�Ϻ�");
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",23), "����");
		System.out.println(tm);
	}

}
