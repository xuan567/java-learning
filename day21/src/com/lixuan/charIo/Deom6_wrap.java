package com.lixuan.charIo;

public class Deom6_wrap {

	public static void main(String[] args) {
		HeiMaStudent hms = new HeiMaStudent(new Student());
		hms.code();
	}

}

interface coder{
	public void code();
}

class Student implements coder{

	@Override
	public void code() {
		System.out.println("c");
		System.out.println("java");
	}
	
}

class HeiMaStudent implements coder{
	private Student s;
	public HeiMaStudent(Student s){
		this.s = s;
	}
	public void code(){
		s.code();
		System.out.println("javaweb");
	}
}