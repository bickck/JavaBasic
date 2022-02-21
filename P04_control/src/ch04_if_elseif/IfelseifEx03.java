

package ch04_if_elseif;

public class IfelseifEx03 {

	public static void main(String[] args) {
		
		int num = 30;
		System.out.println("num : " + num);
		System.out.println();
		
		if(num % 3 == 0)
			System.out.println("3의 배수");
		else if(num % 5 == 0)
			System.out.println("5의 배수");
		else if(num % 3 == 0 && num % 5 == 0)
			System.out.println("3 and 5의 배수");
		else
			System.out.println("??");
		System.out.println();
		
		if(num % 3 == 0 && num % 5 == 0)
			System.out.println("3 and 5의 배수");
		else if(num % 5 == 0)
			System.out.println("5의 배수");
		else if(num % 3 == 0)
			System.out.println("3의 배수");
		else
			System.out.println("??");
		System.out.println();
		
		
	}
	
}
















