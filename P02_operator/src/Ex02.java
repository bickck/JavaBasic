

/*
 * 복합 대입 연산자
 * - += , -= .....
 *   Ex) a += b -> a = a + b
 *       a 와 b를 더한후에 나온 결과를 왼쪽의 a에 대입합니다
 */

public class Ex02 {

	public static void main(String[] args) {
		
		int ic = 10;
		System.out.println("ic : " + ic);
		
		ic += 5;
		System.out.println("ic : " + ic);
		
		//5 += ic;
		// 연산후에 나온 결과를 왼쪽에 대입하기 때문에, 왼쪽에는 항상 변수가 있어야 합니다
		
		int id = 2;
		ic *= id;
		System.out.println("ic : " + ic);
		
		
	}
	
}



















