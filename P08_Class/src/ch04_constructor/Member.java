



package ch04_constructor;

/*
 * 생성자 ( constructor )
 * - class 명과 동일한 이름을 사용하는, 객체를 초기화하는 용도로 사용되는 메서드 입니다
 * - 생성자를 정의하지 않으면 멤버필드의 기본값으로 초기화하는 기본생성자가 자동으로 만들어져 실행됩니다
 * - 생성자는 매개변수를 사용할 수 있기 때문에 오버로딩이 가능합니다
 * - 생성자를 하나라도 정의하면 기본생성자가 자동으로 만들어지지 않습니다
 * - 반환타입은 정의할 수 없습니다
 */

public class Member {

	private String id;
	private String name;
	private int age;
	
	Member(){
		System.out.println("- constructor -");
	}
	
//	String Member(String _id){
//		return _id;
//	}
	
	Member(String _id, String _name, int _age){
		System.out.println("- constructor 2 -");
		id = _id;
		name = _name;
		age = _age;
	}
	
	String getId() { return id; }
	void setId(String _id) {
		id = _id;
	}
	
	String getName() { return name; }
	void setName(String _name) {
		if(_name.length() <= 10) {
			name = _name;
		} else {
			System.out.println("이름은 10글자까지 가능합니다~");
		}
	}
	
	int getAge() { return age; }
	void setAge(int _age) {
		if(_age >= 0 && _age <= 130) {
			age = _age;
		} else {
			System.out.println("나이는 0 ~ 130 사이만 가능합니다~");
		}
	}
	
	void info() {
		System.out.println("--- 회 원 정 보 ---");
		System.out.println("ID  : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}























