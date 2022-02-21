



package ch06_for;

public class ForEx03 {

	public static void main(String[] args) {
		
		// 1 ~ n 까지의 합
		int last = 10;  // 마지막 값
		int tot = 0;    // 합
		
		for(int i=1 ; i<=last ; i++) {
			tot += i; // tot  = tot + i
			          //  1      0  + 1
			          //  3      1  + 2
			          //  .....
		}
		System.out.println("1 ~ " + last + " 까지의 합 : " + tot);
		System.out.println();
		
		tot = 0;
		for(int i=last ; i>0 ; i--) {
			tot += i;
		}
		System.out.println("1 ~ " + last + " 까지의 합 : " + tot);
		
		
		
	}
	
}


















