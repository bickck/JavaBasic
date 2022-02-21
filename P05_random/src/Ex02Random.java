import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		// Random class 객체 생성

		Random random = new Random();

		// nextInt() : int 범위에서 생성
		int ra = random.nextInt();
		System.out.println(ra);
		System.out.println();

		// nextInt( bound) : 0 ~ bound - 1 범위에서 생성
		int rb = random.nextInt(10);
		for(int i = 0;i< 10 ;i++) {
			System.out.println(rb);
		}
		
		System.out.println();

	}
}
