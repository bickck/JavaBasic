package ch03_mapQuiz;

import java.io.IOException;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		MemberManager manager = new MemberManager();

		while (true) {
			System.out.println("1. 회원가입, 2. 회원 삭제, 3. 회원 목록  4. 회원 수정 >>");
			int select = System.in.read() - 48;
			while (System.in.read() != '\n')
				;

			switch (select) {
			case 1:
				manager.insert();
				break;
			case 2:
				manager.delete();
				break;
			case 3:
				manager.view();
				break;
			case 4:
				manager.edit();
				break;
			case 0:
				manager.end();
				break;
			default:
				System.out.println("선택 오류!~");
			}
		}
	}
}
