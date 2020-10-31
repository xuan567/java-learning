package com.lixuan.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test_shuffer {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] colour = {"����","����","��Ƭ","÷��"};
		ArrayList<String> poker = new ArrayList<>();
		for (String s1 : colour) {
			for (String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}
		poker.add("С��");
		poker.add("����");
		
		Collections.shuffle(poker);
		
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		for(int i=0;i<poker.size();i++) {
			if(i>=poker.size()-3) {
				dipai.add(poker.get(i));
			}
			else if(i%3==0)
				a.add(poker.get(i));
			else if(i%3==1)
				b.add(poker.get(i));
			else if(i%3==2)
				c.add(poker.get(i));
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(b);
		System.out.println(dipai);
	}

}
