package com.lixuan.threadMothed;

public class Deom4_join {

	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			public void run() {
				for(int i =0;i<10;i++) {
					System.out.println(this.getName()+"...aaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i =0;i<10;i++) {
					if(i==2)
						try {
							t1.join(1);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					System.out.println(this.getName()+"...bbb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
