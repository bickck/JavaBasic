package ch04_chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		// 서버 만들기
		ServerSocket listener = null;
		Socket socket = null;
		BufferedReader sin = null;
		BufferedWriter sout = null;
		Scanner scanner = new Scanner(System.in);
		try {

			listener = new ServerSocket(9994); // 서버 소켓 생성
			System.out.println("Server ready~");
			socket = listener.accept(); // 클라이언트로 부터 연결 요청 대기
			System.out.println("연결되었습니다..");

			sin = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓 입력 스트림
			sout = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 소켓 출력 스트림

			String inputMessage;
			while (true) {
				inputMessage = sin.readLine(); // 클라이언트로 부터 데이터 읽기
				if (inputMessage.equals("end")) {
					System.out.println("연결 종료!!");
					break;
				}
				System.out.println("클라이언트 : " + inputMessage); // 클라이언트가 보낸 메시지 출력

				System.out.print("서버 >> ");
				String outputMessage = scanner.nextLine();
				sout.write(outputMessage + "\n");
				sout.flush();
			}

		} catch (Exception e) {
			System.out.println("입출력 error~");
			int pid = getProcessPID(9994);
			System.out.println("실행~");
			if (pid != -1) {
				Runtime.getRuntime().exec("taskkill /F /PID" + pid);
			}
		} finally {
			try {
				if (scanner != null)
					scanner.close();
				if (socket != null)
					socket.close();
				if (listener != null)
					listener.close();
			} catch (Exception e2) {
				System.out.println("클라이언트와 연결중 오류 발생~");
			}
		}
	}

	public static int getProcessPID(int port) throws Exception {
		Process ps = new ProcessBuilder("cmd", "/c", "netstat -a -o").start();
		BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));

		String line;
		while ((line = br.readLine()) != null) {
			if (line.contains(":" + port)) {
				while (line.contains(" ")) {
					line = line.replaceAll(" ", " ");
				}
				int pid = Integer.valueOf(line.split(" ")[5]);
				ps.destroy();
				return pid;
			}
			return 0;
		}
		return -1;
	}
}
