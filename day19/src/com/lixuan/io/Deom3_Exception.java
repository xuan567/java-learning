package com.lixuan.io;

public class Deom3_Exception {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		try {
			System.out.println(arr[10]);
		}catch(ArithmeticException e) {
			System.out.println("除数不能为零");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界了");
		} catch (Exception e) {
			System.out.println("出错了");
		}
	}

}
