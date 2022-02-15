
public class Ex03Printf {

	public static void main(String[] args) {

		// printf : 문자열 안에 서식지정자를 사용해서 외부의 값을 출력할 수 있다.
		// - 정수 : %d
		// - 실수 : %f
		// - 문자 : %c
		// - 라인 변경 : \n

		// 정수
		System.out.printf("숫자 : %d\n", 10);

		// 실수
		System.out.printf("실수 : %f\n", 1.2);

		// 문자
		// - 문자 하나의 데이터를 표시할 때에는 ' '로 작성합니다.
		// - java는 문자 하나를 2byte로 처리하기 떄문에 한글 적용이 가능합니다.
		System.out.printf("문자 : %c\n", 'g');
		System.out.printf("문자 : %c\n", '가');
		
		System.out.printf("문자열 %s\n","Hello");
		
		// 서식지정자 안에 정수값을 사용하면, 출력시 해당 위치에 숫자만큼의 공간을 확보하고 값을 출력합니다.
		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123);
		System.out.printf("%-5d#\n",123);
		
		// 실수값을 출력할 때 서식지정자안에 '%.숫자f', 로 작성하면, 해당 숫자까지의 소수점 자리를 출력합니다.
		System.out.printf("%.2f\n",12.1234);
		System.out.printf("%7.2f\n",12.1234);
		System.out.printf("%.2f\n",12.1234);
		
		System.out.printf("%5d\n",100);
		System.out.printf("%5d\n",10);
		System.out.printf("%5d\n",2);
	}
}
