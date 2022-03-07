package ch03_socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	public static void main(String[] args) {

		// 서버 만들기
		ServerSocket listener = null;
		Socket socket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);

		try {
			listener = new ServerSocket(9999); // 서버 소켓 생성
			System.out.println("Server ready~");
			socket = listener.accept(); // 클라이언트로 부터 연결 요청 대기
			System.out.println("연결되었습니다...");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String inputMessage = br.readLine(); // 클라이언트로부터 한행의 텍스트 받기
			System.out.println(inputMessage); // 클라이언트가 보낸 메시지 출력
			
			
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
