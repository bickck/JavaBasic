
package ch02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * Person class 객체를 Set으로 관리하는 PersonManager class를 구현하세요
 * 
 */

public class PersonManager {

	private Scanner scanner = new Scanner(System.in);
	private Set<Person> set;

	public PersonManager() {
		set = new HashSet<>();
	}

	public int inputInteger(String message) {
		System.out.print(message);
		int value = scanner.nextInt();
		return value;
	}

	// 회원 관리 메뉴
	public void menu() {
		while (true) {
			int select = inputInteger("1.추가  2.삭제  3.목록 > ");

			switch (select) {
			case 1: // 추가
				insert();
				break;
			case 2: // 삭제 : 전화번호로 진행합니다
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

	public void insert() {
		System.out.println("전환번호와 이름을 입력하세요.");
		String name = scanner.nextLine();
		String phoneNumber = scanner.nextLine();

		set.add(new Person(phoneNumber, name));
	}

	
	public void delete() {
		String phoneNumber = scanner.nextLine();
	
		set.remove(phoneNumber);
	}

	public void view() {
		Iterator<Person> itr = set.iterator();
		while(!itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void end() {

	}

}
