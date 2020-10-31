package com.lixuan.thread;

import java.util.Timer;
import java.util.TimerTask;

public class Deom3_Timer {
	Timer t = new Timer();
	t.
	while(true) {
		Thread.sleep(1000);
		System.out.println(new Date());
	}

}

class MyTimerTask extends TimerTask{
	public void run() {
		System.out.println("Æð´²");
	}
}