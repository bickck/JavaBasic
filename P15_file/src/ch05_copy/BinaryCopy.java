package ch05_copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args) {
		File path = new File("E:\\test\\picture.jpg");
		File dest = new File("E:\\test\\dest\\picture.jpg");

		FileInputStream fis = null;
		FileOutputStream fos = null;
		int data;

		try {
			fis = new FileInputStream(path);
			fos = new FileOutputStream(dest);

			while ((data = fis.read()) != -1) {
				fos.write((byte) data);
			}
			System.out.println(dest.getPath() + "복사 완료 !! ~~ ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("파일 복사 error");
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
