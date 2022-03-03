
public class Ex04Throws {

	public static void main(String[] args) {
		try {
			int res = Calc.div(10, 4);
			System.out.println("res:" + res);
		} catch (Exception e) {
			System.out.println("Calc.div() error");
		}
	}

}
