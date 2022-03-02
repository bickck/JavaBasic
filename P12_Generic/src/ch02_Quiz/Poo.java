package ch02_Quiz;

/*
 * Poo class 를 정의하세요...
 * - 제너릭 타입 하나를 가지는 class 입니다..
 */
public class Poo<T> {

	private T data;

	public Poo(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

	public void setDate(T data) {
		this.data = data;
	}
}
