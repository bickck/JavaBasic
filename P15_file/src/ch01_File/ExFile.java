package ch01_File;

import java.io.File;
import java.io.IOException;

public class ExFile {

	public static void main(String[] args) throws IOException {
		File path = new File("E:\\test");
		
		if(path.exists() == false) {
			path.mkdir();
			System.out.println("폴더 생성");
		}
		System.out.println("존재");
		
		File mf = new File(path, "test.txt");
		
		if(mf.createNewFile()) {
			System.out.println("파일 생성");
		}else {
			System.out.println("파일 중복");
		}
	}
}
