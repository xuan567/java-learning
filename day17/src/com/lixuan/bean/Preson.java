package com.lixuan.bean;

public class Preson implements Comparable<Preson>{
	private String name;
	private int age;
	public Preson() {
		super();
		
	}
	public Preson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Preson [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		
		return 10;
	}
	@Override
	public boolean equals(Object obj) {
		Preson p =(Preson)obj;
		return this.name.equals(p.name)&&this.age==p.age;
	}
	@Override
	public int compareTo(Preson o) {
		
//		int num = this.age-o.age;
//		return num==0?this.name.compareTo(o.name):num;
		/*int num = this.name.compareTo(o.name);
		return num==0?this.age-o.age:num;*/
		
		int length = this.name.length() - o.name.length();
		int num =( length==0? this.name.compareTo(o.name):  length );
		return num==0? this.age-o.age:num;
	}
	
	
}
