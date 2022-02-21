



public class ArrayEx07 {

	public static void main(String[] args) {
		
		// 2차원 배열
		//                   행   열
		int[][] ar1 = new int[2][3];  // ar1     [0]   [1]   [2]
		                              // [0]행  |  0  |  0  |  0  |
									  // [1]행  |  0  |  0  |  0  |	
		ar1[1][1] = 10;
		
		System.out.println("ar1 행의 수 : " + ar1.length);
		System.out.println("ar1[0] 행의 요소의 수 : " + ar1[0].length);
		
		// 전체 요소 접근
		for(int i=0 ; i<ar1.length ; i++) { // 행
			
			System.out.print(i + "행 : ");
			for(int j=0 ; j<ar1[i].length ; j++) { // 열
				System.out.print(ar1[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		int[][] ar2 = new int[2][];
		ar2[0] = new int[5];
		ar2[1] = new int[3];
		for(int i=0 ; i<ar2.length ; i++) { // 행
			
			System.out.print(i + "행 : ");
			for(int j=0 ; j<ar2[i].length ; j++) { // 열
				System.out.print(ar2[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		
	}
	
}



















