package ch01_File;

import java.io.File;
import java.io.FileOutputStream;

/*
 * stream
 * - 프로그램과 입출력 장치를 연결하는 소프트웨어 모듈
 *   > 출력 스트림 : 출력 장치로 데이터 출력
 *     입력 스트림 : 입력 장치로부터 프로그램에게 데이터 전송
 * - 스트림은 단방향으로 진행합니다
 *
 * 바이트 스트림 ( 1byte 처리 )
 * - FileOutputStream, FileInputStream
 *
 * 문자 스트림 ( 2byte 처리 )
 * - 문자만 입출력하는 스트림
 * - BufferedReader, BufferedWriter, FileReader, FileWriter
 * 
 * 파일 입출력 기본 과정
 * - 파일 열기 -> 파일 쓰기 or 읽기 -> 파일 닫기
 */

public class ByteOut {

	public static void main(String[] args) throws Exception {
		File path = new File("E:\\test");

		// 폴더가 있는지 확인
		if (path.exists() == false) {
			path.mkdir();
			System.out.println("폴더 생성");
		}

		// 폴더위치, 파일명을 가지는 객체 생성
		File mf = new File(path, "test.txt");

		// 경로에 파일이 없으면 파일 생성
		if (mf.createNewFile()) {
			System.out.println(mf.getName() + " - 파일 생성");
		}

		// 데이터 전송 통로 생성
		// - 객체 생성시 true( 이어쓰기 ), false ( 다시쓰기, 기본값 )
		FileOutputStream fos = new FileOutputStream(mf);

		String data = "korea 한국";

		try {

			byte[] text = data.getBytes();
			fos.write(text); // byte 배열의 데이터 전부를 출력 스트림으로 출력

		} catch (Exception e) {
			System.out.println("파일 저장 error~");
		} finally {
			fos.close(); // 스트림 닫기
		}

	}
}
