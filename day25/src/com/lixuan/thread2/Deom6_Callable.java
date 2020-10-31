package com.lixuan.thread2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Deom6_Callable {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = pool.submit(new MyCallable(100));
		Future<Integer> f2 = pool.submit(new MyCallable(50));
		System.out.println(f1);
		System.out.println(f2);
		pool.shutdown();

	}
	public class MyCallable  implements Callable<Integer>{
		private int number;
		public MyCallable(int number) {
			this.number = number;
		}
		@Override
		public Integer call() throws Exception {
			int sum = 0;
			for(int i = 1;i<=number;i++) {
				sum+=i;
			}
			return sum;
		}
		
	}

}

