package com.lixuan.thread2;

public class Deom4_ThreadGroup {

	public static void main(String[] args) {
		//deom1();
		ThreadGroup tg = new ThreadGroup("我是一个新的线程组");
		MyRunnable mr =new MyRunnable();

		Thread t1 = new Thread(tg,mr,"张三");
		Thread t2 = new Thread(tg,mr,"李四");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
	}

	public static void deom1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr,"张三");
		Thread t2 = new Thread(mr,"李四");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t1.getThreadGroup();
		System.out.println(tg1);
		System.out.println(tg2);
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<1000;i++) {
			System.out.println(Thread.currentThread().getName()+"..."+i);
		}
	}
	
}