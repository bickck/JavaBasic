package ch02_Quiz;

/*
 * Poo class 에 Product class를 적용한 객체를 생성하세요..
 */
public class QuizTest {

	public static void main(String[] args) {
		Poo<Product> poo = new Poo<Product>(new Product("Galaxy S22", 10000000));

		Product data = poo.getData();
		System.out.println(data.toString());
	}

}
