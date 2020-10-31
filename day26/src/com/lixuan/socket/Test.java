package com.lixuan.socket;
import java.net.DatagramPacket;

import java.net.DatagramSocket;

import java.net.InetAddress;

import java.util.Scanner;

 

public class Test {

	public static void main(String[] args) throws InterruptedException {

		new receive().start();

		Thread.sleep(500);		//���߳�˯һ�ᣬ��ֹSend�߳��ȿ�������֤Receive�߳���ȫ����

		new send().start();

	}

}

 

class receive extends Thread {

	public void run() {

		try {

			//����Socket�൱�ڴ�����ͷ

			DatagramSocket socket = new DatagramSocket(6666);

			//����Packet�൱�ڴ�����װ��

			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

			

			while(true) {

				//���ϵؽӻ�����������

				socket.receive(packet);

				

				//���ϵػ�ȡ����,���������Ƿ���Ч

				byte[] arr = packet.getData();

				//���ϵػ�ȡ��Ч���ֽڸ���

				int len = packet.getLength();

				//���ϵػ�ȡip��ַ

				String ip = packet.getAddress().getHostAddress();

				//���ϵػ�ȡ�˿ں�

				int port = packet.getPort();

				

				System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}

 

class send extends Thread {

	public void run() {

		try {

			//��������¼�����

			Scanner sc = new Scanner(System.in);

			//����Socket�൱�ڴ�����ͷ

			DatagramSocket socket = new DatagramSocket();

			

			while(true) {

				//���ϵػ�ȡ����¼����ַ���

				String line = sc.nextLine();

				//���ϵض��ַ������жϣ�ֱ�������ַ���quit

				if("quit".equals(line)) {

					break;

				}

				//���ϵش���Packet�൱�ڼ�װ��

				DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);

				//���ϵط���,�����ݷ���ȥ

				socket.send(packet);

			}

			//�ر���ͷ����Ϊ��ײ���IO��

			socket.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
