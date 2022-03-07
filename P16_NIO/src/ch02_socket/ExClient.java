
package ch02_socket;

import java.net.InetAddress;
import java.net.Socket;

/*
 * localhost
 * - 자신의 컴퓨터 주소를 localhost 또는 127.0.0.1 로 표현합니다
 * - localhost 는 자신의 컴퓨터를 가리키는 호스트이름(도메인) 입니다
 */

public class ExClient {

	public static void main(String[] args) {

		// ip 관리
		// InetAddress ia = null;
		// Socket
		Socket socket = null;

		try {
			// ia = InetAddress.getLocalHost();
			// socket = new Socket(ia, 9999); // 클라이언트 Socket 생성

			socket = new Socket("localhost", 9999); // 클라이언트 Socket 생성
			System.out.println("서버에 연결 되었습니다..");
		} catch (Exception e) {
			System.out.println("클라이언트 error~");
		} finally {
			try {
				socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
