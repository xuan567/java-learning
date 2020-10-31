package com.lixuan.bean;

public class Preson {
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
	public boolean equals(Object obj) {
		Preson p = (Preson) obj;
		return this.name.equals(p.name)&&this.age == p.age;
	}
	

}
