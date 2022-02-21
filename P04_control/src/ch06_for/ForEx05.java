



package ch06_for;

public class ForEx05 {

	public static void main(String[] args) {
		
		for(int cnt=1 ; cnt<=3 ; cnt++) {
		
			for(int i=1 ; i<=5 ; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		
		}
		System.out.println();
		
		
		for(int dan=2 ; dan<=9 ; dan++) {
			
			System.out.println("- " + dan + "단 -");
			for(int i=1 ; i<=9 ; i++) {
				System.out.println(dan + " x " + i + " = " + (dan*i));
			}
			System.out.println();
			
		}
		
		
	}
	
}















