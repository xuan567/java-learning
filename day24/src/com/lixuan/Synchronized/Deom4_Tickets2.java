package com.lixuan.Synchronized;

public class Deom4_Tickets2 {

	public static void main(String[] args) {
		MyThreat mt = new MyThreat();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}

class MyThreat implements Runnable{
	private int tickets = 100;
	public void run(){
		while(true) {
			synchronized (Tickets.class) {
				if(tickets==0)
					break;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"ÕâÊÇµÚ"+tickets-- +"ºÅÆ±");
			}
		}
	}
}