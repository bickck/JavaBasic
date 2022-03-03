



package ch01_list;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {

	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Member> list;
	
	public MemberManager() {
		list = new ArrayList<>();
	}
	
	public int inputInteger(String message) {
		System.out.print(message);
		int value = scanner.nextInt();
		return value;
	}
	
	// 회원 관리 메뉴
	public void menu() {
		while(true) {
			int select = inputInteger("1.추가  2.삭제  3.목록 > ");
			
			switch(select) {
			case 1: // 추가
				insert();
				break;
			case 2: // 삭제
				delete();
				break;
			case 3: // 목록
				view();
				break;
			case 0: // 종료
				end();
			default: 
				System.out.println("선택 오류~");
			}
			System.out.println();		
		}
	} // menu() end
	
	// 회원 추가
	public void insert() {
		System.out.println("--- 회 원   추 가 ---");
		System.out.print("이름 입력 > ");
		String name = scanner.next();
		System.out.print("나이 입력 > ");
		int age = scanner.nextInt();
		list.add(new Member(name, age));
	} // insert() end
	
	// 회원 목록
	public void view() {
		System.out.println("--- 회 원   목 록 ---");
		for(Member man : list) {
			System.out.println(man);
		}
		System.out.println("회원수 : " + list.size());
	} // view() end
	
	// 회원 삭제 : 삭제 이름 입력받아서 list 에서 삭제
	public void delete() {
		System.out.println("--- 회 원   삭 제 ---");
		System.out.print("삭제 이름 입력 > ");
		String dname = scanner.next();
		Member man = findName(dname);
		if(man == null) {
			System.out.println("이름 검색 실패~");
			return;
		}
		list.remove(man);
		System.out.println(dname + "삭제!!");
	} // delete() end
	
	// 회원 검색
	public Member findName(String dname) {
		for(Member man : list) {
			if(man.getName().equals(dname)) {
				return man;
			}
		}
		return null;
	}
	
	// 프로그램 종료
	public void end() {
		System.out.println("- Program end -");
		System.exit(0); // 현 위치에서 프로그램 강제 종료
	}
	
}

























