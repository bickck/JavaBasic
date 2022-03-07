



package Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCalcClient {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BufferedWriter cout = null;
		BufferedReader cin = null;
		Socket socket = null;
		
		try {
			
			socket = new Socket("localhost", 9993); // 클라이언트 소켓 생성
			System.out.println("서버에 연결되었습니다...");
			
			cin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			cout = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String outMessage;
			while(true) {
				System.out.print("숫자 입력 > ");
				outMessage = scanner.nextLine();
				
				try {
					// 입력값이 숫자가 아니면 NumberFormatException 발생
					int data = Integer.parseInt(outMessage);
					
					// 정상이면 서버로 데이터 전송
					cout.write(outMessage + "\n");
					cout.flush();
					if(data < 0) { // -(minus) 값이 입력되었으면 종료
						cout.write(outMessage + "\n");
						cout.flush();
						break;
					}
					String inMessage = cin.readLine(); // 서버로부터 전송된 데이터 수신
					System.out.println(inMessage); // 서버로부터 전송된 데이터 출력
					
				} catch (NumberFormatException e) {
					System.out.println("오류~ 다시 입력하세요..");
					continue;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(scanner != null) scanner.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}




















