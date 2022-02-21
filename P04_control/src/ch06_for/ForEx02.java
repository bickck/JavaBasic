



package ch06_for;

public class ForEx02 {

	public static void main(String[] args) {
		
		// 1 ~ 30 사이의 n 의 배수
		int n = 7;
		for(int i=1 ; i<=30 ; i++) {
			if(i%n == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		for(int i=n ; i<=30 ; i+=n) {
			System.out.println(i);
		}
		
		
	}
	
}


















