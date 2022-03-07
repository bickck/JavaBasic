package Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 클라이언트가 서버로 보낸 데이터 더하기
 * - 서버를 먼저 실행시키고 클라이언트를 실행해서 서버 연결
 * - 클라이언트는 사용자로부터 숫자를 입력받아서 전송
 *   > -(마이너스) 값이 전송되기 전까지 입력값을 서버에서 더합니다
 * - 클라이언트로 부터 마이너스 값이 전송되면 종료합니다   
 */

public class CalcServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader request = null;
		BufferedWriter response = null;

		try {

			serverSocket = new ServerSocket(9999);
			System.out.println("Server Ready !!");

			socket = serverSocket.accept();
			System.out.println("연결 되었습니다. !!");

			request = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			response = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			String requestedMessage = "";
			int responseMessage = 0;

			while (true) {
				requestedMessage = request.readLine();
				int result = Integer.valueOf(requestedMessage);

				if (result < 0) {
					System.out.println("연결 종료 !!");
					response.write(String.valueOf(responseMessage) + "\n");
					response.flush();
					break;
				}
				System.out.println("사용자로부터 받은 값 :" + requestedMessage);
				responseMessage += result;
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입출력 error 발생~");
			System.out.println(e.getStackTrace());
		} finally {
			try {

				if (socket != null)
					socket.close();
				if (serverSocket != null)
					serverSocket.close();
			} catch (Exception e2) {
				System.out.println("서버와 통신중 오류 발생했습니다.~");
				System.out.println(e2.getStackTrace());
			}
		}

	}
}
