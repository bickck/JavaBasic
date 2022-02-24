
package ch03_Override;

public class ScoreTest {

	public static void main(String[] args) {

		Score scoreA = new Score("scoreA", 98, 87);
		scoreA.calcTot();
		scoreA.calcAvg();
		scoreA.resultScore();
		System.out.println();

		Score2 manA = new Score2("manA", 99, 88, 89);
		// manA.calcTot2();
		manA.calcTot();
		// manA.calcAvg2();
		manA.calcAvg();
		// manA.result();
		manA.resultScore();

	}

}
