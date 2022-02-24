package ch06_Quiz;

public class SpecialForce extends Military {

	public SpecialForce(String name) {
		super(name);

	}

	@Override
	public void attack() {
		System.out.println(super.getName() + "가 공격합니다.");
	}

	@Override
	public void move() {
		System.out.println(super.getName() + "가 이동합니다.");
	}

}
