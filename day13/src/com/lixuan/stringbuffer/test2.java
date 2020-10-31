package com.lixuan.stringbuffer;

public class test2 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		System.out.println(arrToString(arr));
	}
	public static String arrToString(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1)
				sb.append(arr[i]).append("]");
			else
				sb.append(arr[i]).append(" ,");
		}
		return sb.toString();
		
	}

}
