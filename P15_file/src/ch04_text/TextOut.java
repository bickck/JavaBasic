package ch04_text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextOut {

	public static void main(String[] args) throws Exception {
		File path = new File("E:\\test");

		File mf = new File(path, "string.txt");
		if (mf.createNewFile()) {
			System.out.println(mf.getName() + "파일 생성");
		}

		// 글쓰기
		FileWriter fw = new FileWriter(mf);

		// 입력된 내용을 버퍼에 담기
		BufferedWriter bw = new BufferedWriter(fw);

		// PrintWriter 객체 생성해서 쓰기
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(bw);

			pw.println("문자열 처리를 편리하게 할 수 있습니다.");
			pw.println("보이시나요.. ^^ 네~");

		} catch (Exception e) {
			System.out.println("File쓰기 error");
		} finally {
			pw.close();
		}

	}
}
