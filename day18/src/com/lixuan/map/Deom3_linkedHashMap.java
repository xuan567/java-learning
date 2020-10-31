package com.lixuan.map;

import java.util.LinkedHashMap;

public class Deom3_linkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("张三", 23);
		lhm.put("李四", 24);
		lhm.put("王五", 15);
		System.out.println(lhm);
	}

}
