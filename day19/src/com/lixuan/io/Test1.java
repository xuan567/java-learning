package com.lixuan.io;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入");
		while(true) {
			String s = sc.nextLine();
			try {
				int num = Integer.parseInt(s);
				System.out.println(num);
				break;
			}catch(Exception e1) {
				try {
					new BigInteger(s);
					System.out.println("输入数据过大");
				} catch (Exception e) {
					try {
						new BigDecimal(s);
						System.out.println("输入小数");
					} catch (Exception e2) {
						System.out.println("输入数据不对");
					}
				}
			}
		}
	}

}
