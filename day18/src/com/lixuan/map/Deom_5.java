package com.lixuan.map;

import java.util.HashMap;
import java.util.HashSet;

import com.lixuan.bean.Student;

public class Deom_5 {

	public static void main(String[] args) {
		HashMap<Student, String> hm1 = new HashMap<>();
		hm1.put(new Student("����",23),"����");
		hm1.put(new Student("����",26),"�Ϻ�");
		hm1.put(new Student("����",25),"����");
		
		HashMap<Student, String> hm2 = new HashMap<>();
		hm2.put(new Student("С��",3),"ɽ��");
		hm2.put(new Student("С��",6),"ɽ��");
		hm2.put(new Student("С��",5),"���");
		
		HashMap<HashMap<Student, String>,String> hm = new HashMap<>();
		hm.put(hm1, "��һ��");
		hm.put(hm2, "�ڶ���");
		
		for (HashMap<Student,String> h : hm.keySet()) {
			String value = hm.get(h);
			for (Student key : h.keySet()) {
				String value2 = h.get(key);
				System.out.println(key+".."+value2+".."+"value");
			}
		}
	}

}
