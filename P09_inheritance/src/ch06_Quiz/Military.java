package ch06_Quiz;

/*
 * Military class 를 상속받는 Army, Navy, AriForce class 를 정의하세요
 * - MilitaryTest class 에서 Military class 참조변수를 사용해서 다형성을 구현한 코드를 작성하세요
 */

public abstract class Military {

	private String name; // 군대 이름 ( 육군, 해군, 공군, 특수부대...)

	public Military(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void attack(); // 공격

	public abstract void move(); // 이동

}