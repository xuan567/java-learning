package com.lixuan.test;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("�������û���");
			String userName = sc.nextLine();
			System.out.println("����������");
			String passWord = sc.nextLine();
			
			if("xuan".equals(userName)&&"xuan".equals(passWord)) {
				System.out.println(userName+"��½�ɹ�");
				break;
			}
			else {
				if(i==2)
					System.out.println("��½ʧ��");
				else
					System.out.println("����"+(2-i)+"�λ���");
			}
		}

	}

}
