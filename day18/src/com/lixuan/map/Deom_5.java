package com.lixuan.map;

import java.util.HashMap;
import java.util.HashSet;

import com.lixuan.bean.Student;

public class Deom_5 {

	public static void main(String[] args) {
		HashMap<Student, String> hm1 = new HashMap<>();
		hm1.put(new Student("张三",23),"北京");
		hm1.put(new Student("李四",26),"上海");
		hm1.put(new Student("王五",25),"西安");
		
		HashMap<Student, String> hm2 = new HashMap<>();
		hm2.put(new Student("小三",3),"山东");
		hm2.put(new Student("小四",6),"山西");
		hm2.put(new Student("小五",5),"天津");
		
		HashMap<HashMap<Student, String>,String> hm = new HashMap<>();
		hm.put(hm1, "第一期");
		hm.put(hm2, "第二期");
		
		for (HashMap<Student,String> h : hm.keySet()) {
			String value = hm.get(h);
			for (Student key : h.keySet()) {
				String value2 = h.get(key);
				System.out.println(key+".."+value2+".."+"value");
			}
		}
	}

}
