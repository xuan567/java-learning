package com.lixuan.map;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		String s = "aaaabbbbcc";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : arr) {
			hm.put(c, !hm.containsKey(c)?1:hm.get(c)+1);
		}
		System.out.println(hm);
		for (Character c : hm.keySet()) {
			System.out.println(c+".."+hm.get(c));
		}
	}

}
