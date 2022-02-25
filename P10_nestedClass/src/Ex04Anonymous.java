

/*
 * 익명 중첩 클래스
 * - 상속을 받지 않은 상태에서 메서드를 수정하여 사용할 수 있습니다
 */

class Anony {
	
	public void info() {
		System.out.println("- anony info() -");
	}
	
}

public class Ex04Anonymous {

	public static void main(String[] args) {
		
		Anony anony = new Anony() {
			public void info() {
				System.out.println("- 즐거운 하루 되세요 ^^ -");
			}
		};
		
		anony.info();
		
		
	}
	
}














