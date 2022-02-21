import java.util.Random;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] test = new int[5];
		// 입력
		for(int i=0 ; i<test.length ; i++) {
			test[i] = random.nextInt(30) + 1;
		}
		// 출력
		for(int i=0 ; i<test.length ; i++) {
			System.out.println("test[" + i + "] : " + test[i]);
		}
		System.out.println();
		
		// 특정 범위의 데이터 수
		int count = 0;
		for(int i=0 ; i<test.length ; i++) {
			if(test[i]>=10 && test[i]<=20) {
				++count;
				System.out.print(test[i] + " ");
			}
		}
		System.out.println();
		System.out.println("10 ~ 20 사이의 데이터 수 : " + count);
		System.out.println();
		
		
		// 전체 데이터 합
		int tot = 0;
		for(int i=0 ; i<test.length ; i++) {
			tot += test[i];
		}
		System.out.println("전체 데이터 합 : " + tot);
		System.out.println();
		
		
		// 큰값 찾기
		int max = 0; // 큰값 위치
		for(int i=1 ; i<test.length ; i++) {
			if(test[i] > test[max]) {
				max = i;
			}
		}
		System.out.println("큰값 위치 : " + max + " - 값 : " + test[max]);
 		
		
	}
	
}



















