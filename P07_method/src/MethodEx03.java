import java.util.Scanner;

public class MethodEx03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String menu = "Java : j , Python : p 선택 > ";
		
		char subject = inputSubject(scanner, menu);
	
		//checkSubject(subject);
		if(checkSubject(subject))
			System.out.println("열공하세요..");
		else
			System.out.println("다시 선택하세요..");
		
	}
	
	// 메서드 실행중에 'return'문이 실행되면, 해당 위치에서 메서드의 실행을 멈추고 호출부로 돌아갑니다
	// 메서드안에서 'return'문은 몇번이든 사용할 수 있습니다
	public static boolean checkSubject(char subject) {
		switch(subject) {
		case 'j':
			System.out.println("Java를 선택 하셨습니다..");
			//break;
			return true;
		case 'p':
			System.out.println("Python을 선택 하셨습니다..");
			//break;
			return true;
		}
		//System.out.println("- End -");
		return false;
	}
	
	public static char inputSubject(Scanner scan, String menu) {
		System.out.print(menu);
		char value = scan.next().charAt(0);
		return value;
	}
	
}





















