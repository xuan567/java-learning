package com.lixuan.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Deom2_Receive2 {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		
		while(true) {
			socket.receive(packet);
			String ip = packet.getAddress().getHostAddress();
			int port = packet.getPort();
			byte[] arr = packet.getData();
			int len = packet.getLength();
			System.out.println("ip "+ip + "port"+ port+ new String(arr,0,len));
		}

	}

}
