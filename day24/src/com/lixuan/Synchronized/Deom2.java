package com.lixuan.Synchronized;

public class Deom2 {

		public static void main(String[] args) {
			final printer2 p = new printer2();
			new Thread() {
				public void run() {
					while(true) {
						p.print1();
					}
				}
			}.start();
			
			new Thread() {
				public void run() {
					while(true) {
						p.print2();
					}
				}
			}.start();
			
		}

	}
	class printer2{
		Deom d = new Deom();
		public synchronized void print1() {
				System.out.print("程");
				System.out.print("序");
				System.out.print("员");
				System.out.print("\r\n");
			
		}
		
		public void print2() {
			synchronized (printer.class) {
				System.out.print("掉");
				System.out.print("头");
				System.out.print("发");
				System.out.print("\r\n");
			}
		}
	}
	class Deom{}
