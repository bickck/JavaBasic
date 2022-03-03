



package ch03_map;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PersonManager manager = new PersonManager();
		
		while(true) {
			System.out.print("1.회원가입   2.회원삭제  3.회원목록  >> ");
			int select = scanner.nextInt();
			
			switch(select) {
			case 1:
				manager.insert(); break;
			case 2:
				manager.delete(); break;
			case 3:
				manager.info(); break;
			case 0:
				manager.end();
			default:
				System.out.println("선택 오류~");
			}
			System.out.println();
		}
		
		
	}
	
}





















