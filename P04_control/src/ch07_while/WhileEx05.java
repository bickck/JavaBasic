



package ch07_while;

public class WhileEx05 {

	public static void main(String[] args) {
		
		int out = 0;
		int n = 0;
		
		while(out < 3) {
			
			System.out.print(out + "라인 : ");
			n = 0;
			while(n < 5) {  //5
				System.out.print(n+1 + " ");
				++n;
			}
			System.out.println();			
			++out;
			
		}
		System.out.println();
		
		
		
	}
	
}


















