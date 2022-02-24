
package ch03_Override;

/*
 * 오버라이드( override )
 * - 상속받은 자식 클래스에서 부모 클래스의 메서드를 재정의 하는 것입니다
 * - 메서드의 형태는 부모 클래스의 메서드와 동일해야 합니다
 * - 접근제한자는 동일하거나, 더 넓은 범위여야 합니다
 * - final 선언된 메서드는 오버라이드 할 수 없습니다
 */

public class Score2 extends Score {

	private int java;

	public Score2(String name, int kor, int eng, int java) {
		super(name, kor, eng);
		this.java = java;
	}

	public int calcTot2() {
		tot = kor + eng + java;
		return tot;
	}

	public int calcTot() {
		System.out.println("- calcTot() override -");
		tot = kor + eng + java;
		return tot;
	}

	public double calcAvg2() {
		avg = (double) tot / 3;
		return avg;
	}

	public double calcAvg() {
		System.out.println("- calcAvg() override -");
		avg = (double) tot / 3;
		return avg;
	}

	public void result() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("Java : " + java);
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %.1f\n", avg);
	}

	public void resultScore() {
		System.out.println("- resultScore() override -");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("Java : " + java);
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %.1f\n", avg);
	}

}
