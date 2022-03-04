package ch04_text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TextIn {
	public static void main(String[] args) throws Exception {
		File path = new File("E:\\test");

		File mf = new File(path, "string.txt");

		// 글쓰기
		FileReader fr = new FileReader(mf);

		// 입력된 내용을 버퍼에 담기
		BufferedReader bw = null;

		try {
			bw = new BufferedReader(fr);
			while (true) {
				String line = bw.readLine();
				if (line == null)
					break;
				System.out.println(line);

			}
		} catch (Exception e) {
			System.out.println("파일 읽기 error");
		} finally {
			bw.close();
		}

	}
}
