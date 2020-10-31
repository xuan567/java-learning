package com.lixuan.thread;

public class Deom3 {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for(int i =0;i<10;i++) {
					System.out.println("aaaaa");
				}
			}
		}.start();
		
		new Thread(		new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<10;i++) {
					System.out.println("aaaaa");
				}
			}
		}).start();
	}

}
