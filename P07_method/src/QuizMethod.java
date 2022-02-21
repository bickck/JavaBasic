import java.util.Scanner;

public class QuizMethod {

	public static void main(String[] args) {
		// 이름, 나이, 성별, 키를 입력받아서 반환하는 각각의 메서드를 구현하세요.
		Scanner sc = new Scanner(System.in);

		String name = name(sc);
		int age = age(sc);
		char gender = gender(sc);
		double height = height(sc);

		System.out.println("이름 :" + name + "나이 :" + age + "성별 :" + gender + "키  :" + height);

		// 정수 하나를 입력받아서 반환하는 메서드를 구현하고,
		// 해당 메서드를 사용해서 변수 2개를 각각 초기화 합니다.
		// 위 두개의 변수를 사용해서, 두수중 큰수를 찾아서 반환하는 메서드를 구현하세요.
		// - 변수에 들어가는 값은 1 이상의 값만 가능하고, 같은 값이면 0을 반환합니다.

		int numA = num(sc);
		int numB = num(sc);
		int max = max(sc, numA, numB);
		if (max != 0) {
			System.out.println("두수 중 큰 값 : " + max);
		} else {
			System.out.println("같은 값 : " + max);
		}

	}

	public static int max(Scanner sc, int left, int right) {
		int value = 0;

		while (true) {
			System.out.println(left + " ~ " + right + "사이의 값 입력 :");
			value = sc.nextInt();
			if (value >= left && value <= right) {
				break;
			}
		}

		return value;
	}

	public static int num(Scanner sc) {
		int num = sc.nextInt();
		return num;
	}

	public static String name(Scanner sc) {
		System.out.println("이름 입력");
		String name = sc.nextLine();
		return name;
	}

	public static int age(Scanner sc) {
		System.out.println("나이 입력");
		int age = sc.nextInt();
		return age;
	}

	public static char gender(Scanner sc) {
		System.out.println("성별 입력");
		char gender = sc.nextLine().charAt(0);
		return gender;
	}

	public static double height(Scanner sc) {
		System.out.println("키 입력");
		double height = sc.nextDouble();
		return height;
	}
}
