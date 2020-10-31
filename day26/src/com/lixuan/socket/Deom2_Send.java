package com.lixuan.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Deom2_Send {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		DatagramSocket socket = new DatagramSocket();
		while(true) {
			String str = sc.nextLine();
			if("quit".equals(str))
				break;
			DatagramPacket packet = new DatagramPacket(
				str.getBytes(), str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
			socket.send(packet);
		}
		socket.close();

	}

}
