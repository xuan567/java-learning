package com.lixuan.io;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		while(true) {
			String s = sc.nextLine();
			try {
				int num = Integer.parseInt(s);
				System.out.println(num);
				break;
			}catch(Exception e1) {
				try {
					new BigInteger(s);
					System.out.println("�������ݹ���");
				} catch (Exception e) {
					try {
						new BigDecimal(s);
						System.out.println("����С��");
					} catch (Exception e2) {
						System.out.println("�������ݲ���");
					}
				}
			}
		}
	}

}
