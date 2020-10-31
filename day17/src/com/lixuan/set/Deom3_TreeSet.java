package com.lixuan.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


import com.lixuan.bean.Preson;
import com.lixuan.bean.Student;

public class Deom3_TreeSet {

	public static void main(String[] args) {
		//deom1();
		//deom2();
		//deom3();
		//deom4();
		//deom5();
		//deom6();
		//deom7();
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getSum()-s2.getSum();
				return num==0? 1:num;
			}
		});
		while(ts.size()<5) {
			try{
				String s = sc.nextLine();
			String[] arr = s.split(",");
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[3]);
			int english = Integer.parseInt(arr[3]);
			ts.add(new Student(arr[0],chinese,math,english));
			}catch(Exception e) {
				System.out.println("�����ʽ����");
			}
		}
		for (Student student : ts) {
			System.out.println(student);
		}
	}


	public static void deom7() {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num = i1.compareTo(i2);
				return num==0?1:num;
			}
		});
		while(true) {
			String s = sc.nextLine();
			if("quit".equals(s))
				break;
			Integer i = Integer.parseInt(s);
			ts.add(i);
		}
		for (Integer integer : ts) {
			System.out.println(integer+" ");
		}
	}


	public static void deom6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ���");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num = c1.compareTo(c2);
				return num==0?1:num;
			}
		});
		for (char c : arr) {
			ts.add(c);
		}
		for(Character c : ts) {
			System.out.print(c);
		}
	}



	public static void deom5() {
		List<String> list = new ArrayList<String>();
		list.add("aaaaaa");
		list.add("aaa");
		list.add("zw");
		list.add("aaa");
		list.add("wwwwwdffff");
		list.add("heima");
		
		TsSort(list);
		
		System.out.println(list);
	}
	
	

	public static void TsSort(List<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);
				return num==0?1:num;
			}
			
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}



	public static void deom4() {
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("aaaaaaaaaa");
		ts.add("abc");
		ts.add("z");
		ts.add("wc");
		System.out.println(ts);
	}

	public static void deom3() {
		TreeSet<Preson> ts = new TreeSet<>();
		ts.add(new Preson("��������",27));
		ts.add(new Preson("����",25));
		ts.add(new Preson("����",33));
		ts.add(new Preson("����",24));
		ts.add(new Preson("����",33));
		System.out.println(ts);
	}

	//������������
	public static void deom2() {
		TreeSet<Preson> ts = new TreeSet<>();
		ts.add(new Preson("����",33));
		ts.add(new Preson("����",24));
		ts.add(new Preson("����",25));
		ts.add(new Preson("����",33));
		System.out.println(ts);
	}

	public static void deom1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(1);
		ts.add(1);
		System.out.println(ts);
	}

}

class CompareByLen implements Comparator<String>{
	public int compare(String s1,String s2) {
		int length = s1.length()-s2.length();
		return length==0?s1.compareTo(s2):length;
	}
}
