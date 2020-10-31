package com.lixuan.Synchronized;

public class Deom1_Synchronized {

	public static void main(String[] args) {
		final printer p = new printer();
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
		
	}

}
class printer{
	Deom d = new Deom();
	public void print1() {
		synchronized (d) {
			System.out.println("程");
			System.out.println("序");
			System.out.println("员");
			System.out.println("\r\n");
		}
	}
	
	public void print2() {
		synchronized (d) {
			System.out.println("掉");
			System.out.println("头");
			System.out.println("发");
			System.out.println("\r\n");
		}
	}
}
class Deom{}