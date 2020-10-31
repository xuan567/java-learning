package com.lixuan.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import com.lixuan.bean.BaseStudent;
import com.lixuan.bean.Student;

public class Deom2 {

	public static void main(String[] args) {
		//deom1();
		TreeSet<Student> ts1 = new TreeSet<>(new CompareByAge());
		ts1.add(new Student("����",23));
		ts1.add(new Student("����",14));
		ts1.add(new Student("����",70));
		
		TreeSet<Student> ts2 = new TreeSet<>(new CompareByAge());
		ts2.add(new BaseStudent("����",23));
		ts2.add(new BaseStudent("����",14));
		ts2.add(new BaseStudent("����",70));
		System.out.println(ts2);
	}

	public static void deom1() {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("����",23));
		list1.add(new Student("����",24));
		
		ArrayList<Student> list2 = new ArrayList<>();
		list1.add(new BaseStudent("����",25));
		list1.add(new BaseStudent("����",26));
		
		list1.addAll(list2);
		System.out.println(list1);
	}

}

class CompareByAge implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		int num = s1.getAge()-s2.getAge();
		return num==0?1:num;
	}
	
}
