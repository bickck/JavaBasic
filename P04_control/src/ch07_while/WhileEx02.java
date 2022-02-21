



package ch07_while;

public class WhileEx02 {

	public static void main(String[] args) {
		
		int num = 0;
		
		num = 1;
		while(true) {
			if(num > 5)
				break;
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		num = 1;
		boolean run = true;
		while(run) {
			System.out.println(num);
			++num;
			if(num > 5)
				run = false;
		}
		
		
		
		
	}
	
}

















