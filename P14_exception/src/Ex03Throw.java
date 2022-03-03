import java.util.Scanner;

/*
 * throw
 * - 예외를 강제로 발생시킬 때 사용합니다
 */

public class Ex03Throw {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int candy = 0;
		int people = 0;
		
		try {
		
			System.out.print("사탕수 입력 > ");
			candy = scanner.nextInt();
			System.out.print("사람수 입력 > ");
			people = scanner.nextInt();
			if(people < 1)
				throw new Exception("1 미만의 값으로 나눌수 없어요..");		
			
			int div = candy / people;
			int mod = candy % people;
			
			System.out.println("한사람당 사탕 수 : " + div);
			System.out.println("남은 사탕수 : " + mod);
		
		} catch(Exception e) {
			System.err.println(e.getMessage());  // 간단한 내용
		} finally {
			System.out.println("- end -");
		}
		
		
		
	}
	
}



















