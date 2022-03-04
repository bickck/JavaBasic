



package Quiz;

import java.io.IOException;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		MemberManager manager = new MemberManager();
		manager.start(); // 기존에 저장된 정보 가져오기
		
		while(true) {
			System.out.print("1.가입  2.삭제  3.목록  4.수정  5.저장  6.가져오기 >> ");
			int select = scanner.nextInt();
			
			switch(select) {
			case 1: 
				manager.insert(); break;
			case 2:
				manager.delete(); break;
			case 3:
				manager.view(); break;
			case 4:
				manager.edit(); break;
			case 5:
				manager.save(); break;
			case 6:
				manager.load(); break;
			case 0:
				manager.end(); break;
			default:
				System.out.println("선택 오류~");
			}
			System.out.println();
		}
		
	}
	
}














