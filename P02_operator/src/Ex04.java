

/*
 * 논리 연산자
 * - && ( and 연산 )
 *   > 조건식_a && 조건식_b
 *     : 조건식_a, 조건식_b 둘다 참이어야 참입니다
 *   
 *   || ( or 연산 )
 *   > 조건식_a || 조건식_b  
 *     : 조건식_a, 조건식_b 둘중에 하나라도 참이면 참입니다
 *     
 *   ! ( not 연산 )
 *   > 참이면 거짓으로, 거짓이면 참으로 변경합니다
 *   
 */

public class Ex04 {

	public static void main(String[] args) {
		
		int na = 10, nb = 7;
		System.out.println("na : " + na + " - nb : " + nb);
		System.out.println();
		
		boolean res;
		res = na > 9 && nb > 9;
		System.out.println("na > 9 && nb > 9 : " + (na > 9 && nb > 9));
		
		res = na > 9 || nb > 9;
		System.out.println("na > 9 || nb > 9 : " + (na > 9 || nb > 9));
		
		res = !(na > 9);
		System.out.println("!(na > 9) : " + res);
		
	}
	
}





















