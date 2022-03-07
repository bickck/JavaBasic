package Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {

	public static void main(String[] args) {

		Socket socket = null;
		BufferedWriter request = null;
		BufferedReader response = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket("localhost", 9999);
			response = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			request = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			String requestMessage = "";
			while (true) {
				System.out.println("값 입력 >");
				requestMessage = sc.nextLine();
				request.write(requestMessage + "\n");
				request.flush();

				if (Integer.valueOf(requestMessage) < 0) {
					String responseMessage = response.readLine();
					System.out.println("서버로부터 받은 값 : " + responseMessage);
					break;
				}
			}
			System.out.println("서비스 종료~~!!");

		} catch (Exception e) {
			System.out.println("입출력 error 발생~");
			System.out.println(e.getStackTrace());
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (sc != null)
					sc.close();
			} catch (Exception e) {
				System.out.println("서버와 통신중 오류 발생했습니다.~");
				System.out.println(e.getStackTrace());
			}

		}

	}
}
