



package ch02_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteIn {

	public static void main(String[] args) throws IOException {
		
		File path = new File("D:" + File.separator + 
	             "_DeviceJava" + File.separator +
	             "01_Java" + File.separator + "fileIO");
		
		// 폴더위치, 파일명을 가지는 객체 생성
		File mf = new File(path, "test.txt");
		
		// 데이터 전송 통로 생성
		FileInputStream fis = new FileInputStream(mf);
		
		try {
			
			while(true) {
				
				int data = fis.read();  // 입력 스트림에서 1byte를 읽어와서 int 타입으로 반환
				if(data == -1) // 파일의 마지막 값 : -1
					break;
				System.out.print((char)data);
				
			}
			
		} catch (Exception e) {
			System.out.println("파일 읽기 error~");
		} finally {
			fis.close(); // 통로 닫기
		}
		
	}
	
}




















