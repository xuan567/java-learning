package com.lixuan.map;


import java.util.HashMap;

import com.lixuan.bean.Student;

public class Deom2_HashSet {

	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap(); 
		hm.put(new Student("����",23), "�Ϻ�");
		hm.put(new Student("����",23), "����");
		hm.put(new Student("����",23), "����");
		hm.put(new Student("����",23), "����");
		System.out.println(hm);
	}

}
