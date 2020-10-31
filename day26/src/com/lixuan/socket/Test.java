package com.lixuan.socket;
import java.net.DatagramPacket;

import java.net.DatagramSocket;

import java.net.InetAddress;

import java.util.Scanner;

 

public class Test {

	public static void main(String[] args) throws InterruptedException {

		new receive().start();

		Thread.sleep(500);		//让线程睡一会，防止Send线程先开启，保证Receive线程完全开启

		new send().start();

	}

}

 

class receive extends Thread {

	public void run() {

		try {

			//创建Socket相当于创建码头

			DatagramSocket socket = new DatagramSocket(6666);

			//创建Packet相当于创建集装箱

			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

			

			while(true) {

				//不断地接货，接收数据

				socket.receive(packet);

				

				//不断地获取数据,无论数据是否有效

				byte[] arr = packet.getData();

				//不断地获取有效的字节个数

				int len = packet.getLength();

				//不断地获取ip地址

				String ip = packet.getAddress().getHostAddress();

				//不断地获取端口号

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

			//创建键盘录入对象

			Scanner sc = new Scanner(System.in);

			//创建Socket相当于创建码头

			DatagramSocket socket = new DatagramSocket();

			

			while(true) {

				//不断地获取键盘录入的字符串

				String line = sc.nextLine();

				//不断地对字符串做判断，直到输入字符串quit

				if("quit".equals(line)) {

					break;

				}

				//不断地创建Packet相当于集装箱

				DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);

				//不断地发货,将数据发出去

				socket.send(packet);

			}

			//关闭码头，因为其底层是IO流

			socket.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
