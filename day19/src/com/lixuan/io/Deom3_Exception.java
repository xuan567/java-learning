package com.lixuan.io;

public class Deom3_Exception {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		try {
			System.out.println(arr[10]);
		}catch(ArithmeticException e) {
			System.out.println("��������Ϊ��");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ����");
		} catch (Exception e) {
			System.out.println("������");
		}
	}

}
