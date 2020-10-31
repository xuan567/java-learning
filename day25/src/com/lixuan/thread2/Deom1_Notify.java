package com.lixuan.thread2;


public class Deom1_Notify {

	public static void main(String[] args) {
		Printer p = new Printer();
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
	}

}
class Printer{
	private int flag = 1;
	public void print1() throws InterruptedException {
		synchronized (this) {
			if(flag!=1) {
				this.wait();
			}
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag=2;
			this.notify();
		}
		
	}
	
	public void print2() throws InterruptedException {
		synchronized (this) {
			if(flag!=2) {
				this.wait();
			}
			System.out.print("掉");
			System.out.print("头");
			System.out.print("发");
			System.out.print("\r\n");
			flag=1;
			this.notify();
		}
	}
}
