package com.lixuan.threadMothed;

public class Deom5_sleep {

	public static void main(String[] args) throws InterruptedException {
		//deom1();
		new Thread() {
			public void run() {
				for(int i =0;i<10;i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(this.getName()+"..."+"bbb");
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for(int i =0;i<10;i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(this.getName()+"..."+"aaa");
				}
			}
		}.start();
	}

	public static void deom1() throws InterruptedException {
		for(int i =20 ;i>=0;i--) {
			Thread.sleep(1000);
			System.out.println("µπº∆ ±"+i+"√Î");
		}
	}

}
