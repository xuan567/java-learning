package com.lixuan.bean;

import java.io.Serializable;

public class Preson implements Serializable{
	private String name;
	int age;
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
	

}
