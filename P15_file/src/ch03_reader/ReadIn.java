package ch03_reader;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ReadIn {

	public static void main(String[] args) throws Exception {
		File path = new File("E:\\test");

		File mf = new File(path, "read.txt");

		FileInputStream fis = new FileInputStream(mf);

		BufferedInputStream bis = new BufferedInputStream(fis);

		DataInputStream dis = new DataInputStream(bis);

		// 데이터 가져오기
		int i = dis.readInt();
		double d = dis.readDouble();
		String str = dis.readUTF();

		System.out.println("int data :" + i + ", double data :" + d + ", String data :" + str);

		dis.close();
	}
}
