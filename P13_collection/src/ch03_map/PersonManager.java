



package ch03_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonManager {

	private Scanner scanner = new Scanner(System.in);
	Map<String, Person> map;  // key : id - value : Person
	
	public PersonManager() {
		map = new HashMap<>();
	}
	
	// 회원 추가
	public void insert() {
		String id = null;
		while(true) {
			System.out.print("ID 입력 > ");
			id = scanner.next();
			if(map.containsKey(id)) {
				System.out.println("중복된  ID 입니다..다시 입력하세요~");
			} else {
				break;
			}
		}
		System.out.print("이름 입력 > ");
		String name = scanner.next();
		map.put(id, new Person(id, name));
	} // insert() end
	
	// 회원 목록
	public void info() {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Person value = map.get(key);
			System.out.println(value);
		}
	} // info() end
	
	// 회원 삭제
	public void delete() {
		System.out.print("삭제 ID 입력 > ");
		String did = scanner.next();
		if(map.containsKey(did)) {
			map.remove(did);
			System.out.println(did + " 삭제 되었습니다..");
		} else {
			System.out.println("없는 ID 입니다..");
		}
	} // delete() end
	
	// 종료
	public void end() {
		System.out.println("- Program end -");
		System.exit(0);
	}
	
}













