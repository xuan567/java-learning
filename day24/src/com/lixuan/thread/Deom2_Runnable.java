package com.lixuan.thread;

public class Deom2_Runnable {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread tr =new Thread(mr);
		tr.start();
		for(int i=0;i<10;i++) {
			System.out.println("bb");
		}

	}

}
class MyRunnable implements Runnable{
	public void run() {
		for(int i = 0;i<10;i++)
			System.out.println("aaaa");
	}
}
