package com.lixuan.thread;

public class Deom1 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.s;
		Singleton s2 = Singleton.s;
		System.out.println(s1==s2);
	}

}

class Singleton{
//	private Singleton() {}
//	private static Singleton s;
//	public static Singleton getInstance() {
//		return s;
//	}
	
//	private Singleton() {}
//	private static Singleton s;
//	public static Singleton getInstance() {
//		if(s==null)
//			s=new Singleton();
//		return s;
//	}
	
	private Singleton() {}
	public static final Singleton s = new Singleton();
}