package ch03_reader;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadOut {

	public static void main(String[] args) throws Exception {
		File path = new File("E:\\test");

		File mf = new File(path, "read.txt");

		FileOutputStream fos = new FileOutputStream(mf);

		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// FileOutputStream을 통해서 받을 객체를 BufferedOutputStream에 넣습니다.

		DataOutputStream dos = new DataOutputStream(bos);
		// DataOutStream 클래스에 버퍼클래스 객체를 넣어서 DataOutStream의 메서드를 사용해서 파일에 저장합니다.

		int n = 10;
		double d = 2.3;
		String str = "buffered 데이터";
		

		dos.writeInt(n);
		dos.writeDouble(d);	
		dos.writeUTF(str);

		dos.close();
	}
}
