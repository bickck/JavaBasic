

package ch05_switch;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		char subject = 'P';
		System.out.println("Java : j , Python : p > " + subject);
		System.out.println();
		
		// case 값은 다르지만, 실행되는 코드가 동일하면 break 문을 없애고 하나로 묶어줍니다
		switch(subject) {
		case 'j':
		case 'J':
			System.out.println("Java를 선택 하셨습니다...");
			break;
		case 'p':
		case 'P':
			System.out.println("python을 선택 하셨습니다...");
			break;
		default:
			System.out.println("없는 과목입니다..");
		}
		
	}
	
}













