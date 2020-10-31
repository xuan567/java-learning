package com.lixuan.thread;

public class Deom1_thread {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("bb");
		}
	}

}
class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("aaaaa");
	}
}