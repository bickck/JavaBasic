package ch03_socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket("localhost", 9999); // 클라이언트 Socket 생성
			System.out.println("서버에 연결 되었습니다..");

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			System.out.println("데이터 입력 >");
			String outPutMessage = sc.nextLine(); // 한행의 문자열

			bw.write(outPutMessage + '\n');
			bw.flush(); // 스트림 안에 데이터를 모두 전송

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
