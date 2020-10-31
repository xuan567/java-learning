package com.lixuan.IO;

public class Deom7_exception {

	public static void main(String[] args) throws Exception {
		Preson p = new Preson();
		p.setAge(-17);
		System.out.println(p.getAge());
	}

}



class Preson{
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

	public void setAge(int age) throws AgeOutException {
		if(age>0&&age<150)
			this.age = age;
		else
			throw new AgeOutException("�������");
	}
	
}