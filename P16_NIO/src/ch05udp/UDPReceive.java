package ch05udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {

	public static void main(String[] args) throws IOException {

		byte[] data = new byte[256];
		// port 5000을 사용해서 데이터 그램을 수신합니다.
		DatagramSocket socket = new DatagramSocket(5000);
		DatagramPacket packet = new DatagramPacket(data, data.length);

		socket.receive(packet);
		System.out.println("수신 :" + new String(data));
		socket.close();

	}
}
