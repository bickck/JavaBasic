



package ch03_Override;

public class Score {

	protected String name;  // 이름
	protected int kor;      // 과목 점수
	protected int eng;
	protected int tot;      // 총점
	protected double avg;   // 평균
	
	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public int calcTot() {
		tot = kor + eng;
		return tot;
	}
	
	public double calcAvg() {
		avg = (double)tot/2;
		return avg;
	}
	
	public void resultScore() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %.1f\n", avg);
	}
}
























