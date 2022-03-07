



package Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
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

public class TCalcServer {

	public static void main(String[] args) {
		
		BufferedReader sin = null;
		BufferedWriter sout = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		int sum = 0; // 클라이언트로 받은 데이터의 합을 구하는 변수
		try {
			listener = new ServerSocket(9993); // 서버 소켓 생성
			socket = listener.accept(); // 클라이언트로 부터 연결 요청 대기
			
			sin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			sout = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String inMessage;
			while(true) {
				inMessage = sin.readLine(); // 클라이언트로부터 전송된 데이터 가져오기
				int data = Integer.parseInt(inMessage);
				if(data < 0) { // 클라이언트가 보낸 데이터가 -(minus) 값이면 종료
					System.out.println("서버 종료!!");
					break;
				}
				sum += data;
				sout.write("입력값의 합 : " + sum + "\n");
				sout.flush();
			}
			
		} catch (IOException e) {
			System.out.println("입출력 오류~");
		} finally {
			try {
				if(socket != null) socket.close();
				if(listener != null) listener.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("합 : " + sum);
		
	}
	
	
}







































