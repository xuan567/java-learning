package com.lixuan.Regex;

import java.math.BigInteger;

public class Deom7_BigInteger {

	public static void main(String[] args) {
		BigInteger bi1=new BigInteger("100");
		BigInteger bi2=new BigInteger("3");
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		BigInteger arr[] = bi1.divideAndRemainder(bi2);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
