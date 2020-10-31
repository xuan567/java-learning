package com.lixuan.threadMothed;

public class Deom3_setDaemon {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i =0;i<2;i++) {
					System.out.println(this.getName()+"...aaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i =0;i<1000;i++) {
					System.out.println(this.getName()+"...bbb");
				}
			}
		};
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}

}
