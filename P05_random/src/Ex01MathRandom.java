
public class Ex01MathRandom {

	public static void main(String[] args) {

		// - 0.0 ~ 0.999999999
		double ra = Math.random();
		System.out.println(ra);
		System.out.println();

		// 0.0 ~ 99.9999999
		double rb = Math.random() * 100;
		System.out.println(rb);
		System.out.println();

		// 0 ~ 99
		int rc = (int) (Math.random() * 100);
		System.out.println(rc);
		System.out.println();

		// 0.0 ~ 99.999999999999
		double rd = ((int) (Math.random() * 100)) / 10.0;
		System.out.println(rd);
		System.out.println();

	}
}
