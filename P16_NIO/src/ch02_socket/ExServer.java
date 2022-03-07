
package ch02_socket;

import java.net.ServerSocket;
import java.net.Socket;

/*
 * # 서버와 클라이언트
 * - 서버 : 클라이언트에게 네트워크를 통해서 서비스를 제공하는 시스템 입니다
 *   클라이언트 : 서버와 대응되는 개념으로, 서비스를 사용하는 사용자 입니다
 * 
 * # Socket
 * - TCP/IP 네트워크를 이용하여 통신 프로그램을 작성하도록 지원하는 기술입니다
 * - 서버와 클라이언트 간에 통신할 수 있도록 해주는 연결 통로 입니다
 * - 소켓끼리 데이터를 주고받으며, 소켓은 특정 IP 포트 번호와 결합됩니다
 * - 클라이언트는 Socket 생성자로 소켓을 생성하지만, 
 *   서버는 ServerSocket 클래스의 생성자로 서버 소켓을 생성한 후에 그것을 사용해서 Socket 객체를 생성합니다
 * 
 * # TCP 프로그램
 * - TCP 소켓은 ServerSocket 클래스와 Socket 클래스로 구성됩니다
 * - 1. TCP 서버는 ServerSocket 클래스의 accept() 메서드가 Socket의 접속을 대기합니다
 *   2. 클라이언트에서 서버에 접속하기 위해서 Socket() 을 생성합니다
 *   3. accept() 메서드는 Socket 을 생성해서 입출력을 위한 스트림을 생성합니다
 *   4. 사용한 통로 닫기
 */

public class ExServer {

	public static void main(String[] args) {

		// 서버 만들기
		ServerSocket listener = null;
		Socket socket = null;

		try {
			listener = new ServerSocket(9999); // 서버 소켓 생성
			System.out.println("Server ready~");
			socket = listener.accept(); // 클라이언트로 부터 연결 요청 대기
			System.out.println("접속 정보 : " + socket.toString());
		} catch (Exception e) {
			System.out.println("서버 error~");
		} finally {
			try {
				socket.close();
				listener.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
