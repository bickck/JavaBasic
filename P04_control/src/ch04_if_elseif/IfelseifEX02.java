

package ch04_if_elseif;

public class IfelseifEX02 {

	public static void main(String[] args) {
		
		int data = 27;
		System.out.println("data : " + data);
		System.out.println();
		
		if(data >= 1 && data <= 10)
			System.out.println(" 1 ~ 10");
		if(data >= 11 && data <= 20)
			System.out.println("11 ~ 20");
		if(data >= 21 && data <= 30)
			System.out.println("21 ~ 30");
		System.out.println();
		
		if(data <= 10)
			System.out.println(" 1 ~ 10");
		else if(data <= 20)
			System.out.println("11 ~ 20");
		else if(data <= 30)
			System.out.println("21 ~ 30");
		
		
	}
	
}





















