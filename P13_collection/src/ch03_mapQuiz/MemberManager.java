package ch03_mapQuiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * 회원정보(Member)를 관리하는 MemberManager class를 정의하세요
 * - HashMap을 사용해서 관리합니다 : 이름(key) - Member(value)
 *   > 추가, 삭제, 수정, 목록, 종료의 기능이 있습니다
 */

public class MemberManager {

	private Map<String, Member> hasMember;
	private Scanner sc;

	public MemberManager() {
		hasMember = new HashMap<String, Member>();
		sc = new Scanner(System.in);
	}

	public void insert() {
		System.out.println("이름과 전화번호를 입력하세요.! ");
		String name = sc.nextLine();
		String phoneNumber = sc.nextLine();

		hasMember.put(name, new Member(name, phoneNumber));

	}

	public void delete() {
		System.out.println("사용자를 삭제합니다.");
		String key = sc.nextLine();
		System.out.println(key + "해당 사용자를 삭제합니다. ");
		if (!hasMember.containsKey(key)) {
			System.out.println(key + "해당 사용자가 없습니다.");
		}
		hasMember.remove(key);

	}

	public void view() {
		System.out.println("사용자 목록 보기");
		Iterator<Entry<String, Member>> value = hasMember.entrySet().iterator();
		while (value.hasNext()) {
			System.out.println("회원 이름" + value.next() + "회원 전화번호" + value.next());
		}

	}

	public void edit() {

		System.out.println("수정을 원하는 사용자 이름을 입력하세요.");
		String key = sc.nextLine();

		if (!hasMember.containsKey(key)) {
			System.out.println(key + "해당 사용자가 없습니다.");
		}
		Member editMember = hasMember.get(key);

		System.out.println("전화번호를 다시 입력해 주세요.");
		String phoneNumber = sc.nextLine();

		editMember.setPhoneNumber(phoneNumber);

		hasMember.put(key, editMember);
		//hasMember.put(key, new Member(key,phoneNumber));

	}

	public void end() {
		System.out.println("시스템 종료");

	}
}
