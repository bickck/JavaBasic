package ch06_object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOut {

	public static void main(String[] args) throws Exception {
		File path = new File("E:\\test");

		File mf = new File(path, "unit.txt");

		if (mf.createNewFile()) {
			System.out.println(mf.getName() + "파일 생성");
		}
		// 통로 생성
		FileOutputStream fos = new FileOutputStream(mf);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		ObjectOutputStream oos = null;

		try {
			Unit unit = new Unit("uid_113", "123");

			// ObjectOutputStream에게 객체를 전달해서 직렬화지시
			oos = new ObjectOutputStream(bos);
			oos.writeObject(unit);
			
		} catch (Exception e) {
			System.out.println("객제 정보 저장 실패");
		} finally {
			oos.close();
		}
	}
}
