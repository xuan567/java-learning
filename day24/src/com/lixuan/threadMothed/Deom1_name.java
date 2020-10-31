package com.lixuan.threadMothed;

public class Deom1_name {

	public static void main(String[] args) {
		//deom1();
		//deom2();
		new Thread() {
			public void run() {
				System.out.println(this.getName()+"..."+"aaa");
			}
		}.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"..."+"b");
			}
		}).start();
		Thread.currentThread().setName("张三");
		System.out.println(Thread.currentThread().getName());
	}

	public static void deom2() {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println(this.getName()+"..."+"aaa");
			}
		};
		Thread t2 =new Thread() {
			public void run() {
				System.out.println(this.getName()+"..."+"bbb");
			}
		};
		t1.setName("张三");
		t2.setName("李四");
		t1.start();
		t2.start();
	}

	public static void deom1() {
		new Thread("张三") {
			public void run() {
				System.out.println(this.getName()+"..."+"aaa");
			}
		}.start();
		new Thread("李四") {
			public void run() {
				System.out.println(this.getName()+"..."+"bbb");
			}
		}.start();
	}

}
