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
				System.out.print("��");
				System.out.print("��");
				System.out.print("Ա");
				System.out.print("\r\n");
			
		}
		
		public void print2() {
			synchronized (printer.class) {
				System.out.print("��");
				System.out.print("ͷ");
				System.out.print("��");
				System.out.print("\r\n");
			}
		}
	}
	class Deom{}
