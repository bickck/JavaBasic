package ch04_chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {

		// Socket
		Socket socket = null;
		BufferedWriter cout = null;
		BufferedReader cin = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9994); // 클라이언트 Socket 생성

			cin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			cout = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			String outputMessage;
			while (true) {
				System.out.print("클라이언트 입력 >> ");
				outputMessage = scanner.nextLine(); // 키보드에서 한행의 문자열 읽기
				if (outputMessage.equals("end")) {
					cout.write(outputMessage + "\n");
					cout.flush(); // 스트림 안에 데이터를 모두 전송
					break; // 사용자가 "end"를 입력한 경우 서버로 데이터 전송 후 종료
				}
				cout.write(outputMessage + "\n");
				cout.flush(); // 스트림 안에 데이터를 모두 전송

				String inputMessage = cin.readLine(); // 서버로부터 데이터 수신
				System.out.println("서버 : " + inputMessage); // 서버로부터 받은 데이터 출력
			}

		} catch (Exception e) {
			System.out.println("입출력 error~");
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (scanner != null)
					scanner.close();
			} catch (Exception e2) {
				System.out.println("서버와 통신중 오류 발생~");
			}
		}
	}
}
