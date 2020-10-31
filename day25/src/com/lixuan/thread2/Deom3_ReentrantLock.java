package com.lixuan.thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Deom3_ReentrantLock {

	public static void main(String[] args) {
		Printer3 p = new Printer3();
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print3();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}
class Printer3{
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	private int flag = 1;
	public void print1() throws InterruptedException {
		r.lock();
			while(flag!=1) {
				c1.await();
			}
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag=2;
			c2.signal();
		r.unlock();
	}
	
	public void print2() throws InterruptedException {
		r.lock();
			while(flag!=2) {
				c2.await();
			}
			System.out.print("掉");
			System.out.print("头");
			System.out.print("发");
			System.out.print("\r\n");
			flag=3;
			c3.signal();
		r.unlock();
		
	}
	
	public void print3() throws InterruptedException {
		r.lock();
			while(flag!=3) {
				c3.await();
			}
			System.out.print("哈");
			System.out.print("哈");
			System.out.print("哈");
			System.out.print("\r\n");
			flag=1;
			c1.signal();
		r.unlock();
		
	}
}