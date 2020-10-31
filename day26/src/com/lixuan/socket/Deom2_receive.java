package com.lixuan.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Deom2_receive {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);
		
		byte[] arr = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(arr,0,len));
		socket.close();

	}

}
