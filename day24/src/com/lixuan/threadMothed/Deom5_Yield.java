package com.lixuan.threadMothed;

public class Deom5_Yield {

	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
	}

}

class MyThread extends Thread {
	public void run() {
		for(int i=0;i<100;i++) {
			if(i%10==0) {
				Thread.yield();
				
			}
			System.out.println(this.getName()+"..."+i);
		}
	}
	
}
