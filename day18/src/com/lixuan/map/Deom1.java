package com.lixuan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Deom1 {

	public static void main(String[] args) {
		//deom1();
		//deom2();
		//deom3();
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		//deom2(map);
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
//		while(it.hasNext()) {
//			Map.Entry<String, Integer> en = it.next();
//			String key = en.getKey();
//			Integer value = en.getValue();
//			System.out.println(key+"..."+value);
//		}
		for ( Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey()+"..."+en.getValue());
			
		}
	}

	public static void deom2(Map<String, Integer> map) {
		Set<String> keySet =  map.keySet();
		Iterator<String> it = keySet.iterator(); 
//		while(it.hasNext()) {
//			String key = it.next();
//			Integer value = map.get(key);
//			System.out.println(key+"..."+value);
//		}
		for (String string : keySet) {
			System.out.println(string+"..."+map.get(string));
		}
	}

	public static void deom3() {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		Collection<Integer> c = map.values();
		System.out.println(c);
		System.out.println(map.size());
	}

	public static void deom2() {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		Integer value = map.remove("����");
		System.out.println(value);
		System.out.println(map);
	}

	public static void deom1() {
		Map<String, Integer> map = new HashMap<>();
		Integer i1 = map.put("����", 23);
		Integer i2 = map.put("����", 24);
		Integer i3 = map.put("����", 25);
		Integer i4 = map.put("����", 26);
		System.out.println(map);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	}

}
