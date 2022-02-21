

/*
 * 증감 연산자
 * - 값을 1 증가 시키거나, 1 감소 시킬때 사용합니다
 *   > ++ : 1 증가
 *     -- : 1 감소
 *     
 *     ++n -> 1 증가후에 다른 연산
 *     n++ -> 다른 연산후에 1 증가
 *     --n -> 1 감소후에 다른 연산
 *     n-- -> 다른 연산후에 1 감소
 */

public class Ex05 {

	public static void main(String[] args) {
		
		int data = 5;
		System.out.println("data : " + data);
		System.out.println();
		
		int res = 0;
		res = ++data;
		System.out.println("data : " + data + " - res : " + res);
		
		res = data++;
		System.out.println("data : " + data + " - res : " + res);
		
		res = --data;
		System.out.println("data : " + data + " - res : " + res);
		
		res = data--;
		System.out.println("data : " + data + " - res : " + res);
		
		
		int n = 5;
		boolean r;
		r = (++n > 6) || (++n > 6);
		System.out.println("n : " + n + " - r : " + r);
		

	}
	
}


















