

/*
 * 배열
 * - 한번의 선언으로 같은 타입의 데이터 공간을 메모리에 연속적으로 생성합니다
 * 
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// 배열 참조 변수 생성
		// - []를 사용해서 배열 참조 변수를 선언합니다
		int[] ar1;
		int ar2[];
		
		// 배열 생성
		ar1 = new int[3];
		// ar1               [0]   [1]   [2]
		//   | A0 | -----> |  0  |  0  |  0  |
		//                A0
		
		// 배열의 요소 사용 : 배열명[index]
		// - 배열안에 하나의 요소를 사용할 때에는 index를 사용합니다
		// - index 번호는 무조건 0부터 시작합니다 ( 임의 변경  X )
		ar1[0] = 10;
		ar1[1] = 20;
		ar1[2] = 30;
		//ar1[3] = 40; Error
		System.out.println("ar1[0] : " + ar1[0]);
		System.out.println("ar1[1] : " + ar1[1]);
		System.out.println("ar1[2] : " + ar1[2]);
		System.out.println();
		
		
		ar2 = new int[] { 1, 2, 1, 3 };
		// ar2               [0]   [1]   [2]   [3]
		//   | B0 | -----> |  1  |  2  |  1  |  3  |
		//                B0
		System.out.println("ar2[0] : " + ar2[0]);
		System.out.println("ar2[1] : " + ar2[1]);
		System.out.println("ar2[2] : " + ar2[2]);
		System.out.println("ar2[3] : " + ar2[3]);
		
		
	}
	
}



















