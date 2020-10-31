package com.lixuan.scanner;

import java.util.Scanner;

public class Deom1_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.println(i);
		}
		else
			System.out.println("´íÎó");

	}

}
