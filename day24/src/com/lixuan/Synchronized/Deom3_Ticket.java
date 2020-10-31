package com.lixuan.Synchronized;

public class Deom3_Ticket {

	public static void main(String[] args) {
		new Tickets().start();
		new Tickets().start();

	}

}
class Tickets extends Thread{
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
				System.out.println(this.getName()+"ÕâÊÇµÚ"+tickets-- +"ºÅÆ±");
			}
		}
	}
}