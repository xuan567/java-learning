package com.lixuan.set;

import java.util.HashSet;

import com.lixuan.bean.Preson;

public class Deom1 {

	public static void main(String[] args) {
		HashSet<Preson> hs = new HashSet<>();
		hs.add(new Preson("����",23));
		hs.add(new Preson("����",24));
		hs.add(new Preson("����",24));
		hs.add(new Preson("����",23));
		System.out.println(hs);
	}

}
