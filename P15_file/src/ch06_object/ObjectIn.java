package ch06_object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectIn {
	public static void main(String[] args) throws Exception {
		File path = new File("E:\\test");
		File mf = new File(path, "unit.txt");

		FileInputStream fis = new FileInputStream(mf);
		BufferedInputStream bis = new BufferedInputStream(fis);

		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(bis);

			Unit unit = (Unit) ois.readObject();

			System.out.println(unit.toString());

		} catch (Exception e) {
			System.out.println("Unit 클래스가 없거나 변조되었습니다.");
		} finally {
			ois.close();
		}

	}
}
