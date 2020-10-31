package com.lixuan.test;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("请输入用户名");
			String userName = sc.nextLine();
			System.out.println("请输入密码");
			String passWord = sc.nextLine();
			
			if("xuan".equals(userName)&&"xuan".equals(passWord)) {
				System.out.println(userName+"登陆成功");
				break;
			}
			else {
				if(i==2)
					System.out.println("登陆失败");
				else
					System.out.println("还有"+(2-i)+"次机会");
			}
		}

	}

}
