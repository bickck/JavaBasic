package ch05udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * # UDP 프로그램
 * - UDP 는 연결설정을 하지 않기 때문에 네트워크에 부담이 적습니다
 * - DatagramSocket, DatagramPacket 클래스를 시용해서 구현합니다
 * 
 * # UDP 방식을 이용한 전송 방법
 * - 1. 데이터를 수신할 DatagramSocket 을 생성합니다
 *   2. 데이터를 전송할 DatagramSocket 을 생성합니다
 *   3. DatagramPacket을 생성해서 DatagramSocket의 send() 메소드의 매개변수로 서버측
 *      DatagramSocket에 데이터를 전송합니다
 *   4. 데이터 수신은 DatagramSocket의 receive() 메서드가 처리합니다    
 */

public class UDPsend {

	public static void main(String[] args) throws IOException {

		DatagramSocket datagramSocket = new DatagramSocket();

		String data = "투표는 꼭 하세요....";

		byte[] bdata = data.getBytes();

		// 주소와 데이터를 데이터그램에 저장해서 송신합니다.
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(bdata, bdata.length, address, 5000);
		datagramSocket.send(packet);
		datagramSocket.close();

	}
}
