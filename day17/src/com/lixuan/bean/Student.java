package com.lixuan.bean;

public class Student {
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int sum;
	public Student() {
		super();
		
	}
	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sum = chinese + math + english;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", chinese=" + chinese + ", math=" + math + ", english=" + english + ", sum="
				+ sum + "]";
	}
	
	
}
	
