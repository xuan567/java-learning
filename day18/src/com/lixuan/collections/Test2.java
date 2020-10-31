package com.lixuan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		//deom1();
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] colour = {"红桃","黑桃","方片","梅花"};
		HashMap<Integer, String> hm = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		TreeSet<Integer> a = new TreeSet<>();
		TreeSet<Integer> b = new TreeSet<>();
		TreeSet<Integer> c = new TreeSet<>();
		TreeSet<Integer> d = new TreeSet<>();
		int index = 0;
		for (String s1 : num) {
			for (String s2 : colour) {
				hm.put(index,s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		hm.put(index,"大王");
		list.add(index);
		index++;
		hm.put(index, "小王");
		list.add(index);
		
		for(int i=0 ; i< list.size();i++) {
			if(i>=list.size()-3)
				d.add(list.get(i));
			else if(i%3==0)
				a.add(list.get(i));
			else if(i%3==1)
				b.add(list.get(i));
			else if(i%3==2)
				c.add(list.get(i));
		}
		
		look(hm,a,"张三");
		look(hm,b,"李四");
		look(hm,c,"王五");
		look(hm,d,"底牌");
	}
 public static void look(HashMap<Integer, String> hm,TreeSet<Integer> ts,String name) {
	 System.out.print(name+"的键是:");
	 for (Integer i : ts) {
		System.out.print(hm.get(i)+" ");
	}
	 System.out.println();
 }

	public static void deom1() {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] colour = {"红桃","黑桃","方片","梅花"};
		ArrayList<String> poker = new ArrayList<>();
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<String> d = new ArrayList<>();
		
		for (String s1 : colour) {
			for (String s2: num) {
				poker.add(s1.concat(s2));
				
			}
		}
		
		Collections.shuffle(poker);
		
		for(int i=0 ; i< poker.size();i++) {
			if(i>=poker.size()-3)
				d.add(poker.get(i));
			else if(i%3==0)
				a.add(poker.get(i));
			else if(i%3==1)
				b.add(poker.get(i));
			else if(i%3==2)
				c.add(poker.get(i));
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
