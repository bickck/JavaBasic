import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int data = 0;
		data = inputInt(scanner);
		System.out.println("data : " + data);
		
		
		
	}
	
	public static int inputInt(Scanner scanner) {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int data = scanner.nextInt();
		return data;
	}
	
}




















