



package ch06_this;

/*
 * this
 * - class안의 instance 멤버를 가리키는 참조변수 입니다
 * 
 * this()
 * - 생성자에서 'this()'를 이용한 다른 생성자를 호출할 수 있습니다
 * - 생성자의 첫번째 라인엔서만 사용이 가능합니다
 */

public class Member {

	private String id;
	private String name;
	private int age;
	
	Member(){
		System.out.println("- constructor -");
		id = "-";
		name = "-";
		age = 0;
	}
	
	Member(String id){
		this();
		System.out.println("- constructor 2 -");
		this.id = id;
		//this.name = "-";
		//this(); Error
	}
	
	Member(String id, String name, int age){
		System.out.println("- constructor 3 -");
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	String getId() { return id; }
	void setId(String id) {
		this.id = id;
	}
	
	String getName() { return name; }
	void setName(String name) {
		if(name.length() <= 10) {
			this.name = name;
		} else {
			System.out.println("이름은 10글자까지 가능합니다~");
		}
	}
	
	int getAge() { return age; }
	void setAge(int age) {
		if(age >= 0 && age <= 130) {
			this.age = age;
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























